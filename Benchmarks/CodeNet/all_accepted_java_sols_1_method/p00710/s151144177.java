import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0 && r == 0) break;

			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i=1;i<=n;i++){
				al.add(i);
			}

			for(int i=0;i<r;i++){
				int p = sc.nextInt();
				int c = sc.nextInt();
				for(int j=0;j<c;j++){
					al.add(al.remove(al.size()-p-c+1));
				}
			}

			System.out.println(al.get(al.size()-1));
		}
	}
}