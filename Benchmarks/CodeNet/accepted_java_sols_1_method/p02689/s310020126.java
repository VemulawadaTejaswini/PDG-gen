import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
		int[] height;		
		height = new int[n];		//標高
		for (int i=0; i<n; i++){
			height[i] =  scan.nextInt();
		}

		HashSet<Integer> hs = new HashSet<>();
		for (int i=0; i<n; i++){
			hs.add(i);
		}

		int a = -1;
		int b = -1;
		for (int i=0; i<m; i++){
			a = scan.nextInt()-1;
			b = scan.nextInt()-1;
//			System.out.println(a +":"+ b);

			if(height[a]>height[b]){
				hs.remove(b);
			} else if(height[a]<height[b]) {
				hs.remove(a);
			} else {		//同じ高さの場合は両方「良い展望台」に該当せず
				hs.remove(a);
				hs.remove(b);
			}
		}
		
		System.out.println(hs.size());
	    scan.close();	
    }
}