import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] list = new ArrayList[10001];
		for(int i=1;i<10001;i++){
			list[i] = new ArrayList<Integer>();
			for(int j=1;j*j<=i;j++) if(i%j==0) list[i].add(j);
		}
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) break;
			
			int[] c = new int[4];
			int min = Integer.MAX_VALUE;
			for(int aa : list[a]){
				for(int bb : list[b]){
					c[0] = aa;
					c[1] = a/aa;
					c[2] = bb;
					c[3] = b/bb;
					Arrays.sort(c);
					min = Math.min(min, (c[3]-c[2])*(c[3]-c[2])+(c[2]-c[1])*(c[2]-c[1])+(c[1]-c[0])*(c[1]-c[0]));
				}
			}
			System.out.println(min);
		}
	}
}