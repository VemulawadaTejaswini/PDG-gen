import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				int m = sc.nextInt();
				int up = 0;
				int down = 0;
				
				int a = sc.nextInt();
				int b = 0;
				for(int j=1;j<m;j++){
					b = sc.nextInt();
					if(a<b)up = Math.max(up, b-a);
					else down = Math.max(down, a-b);
					a = b;
				}
				System.out.println(up + " " + down);	
			}
		}
	}	
}