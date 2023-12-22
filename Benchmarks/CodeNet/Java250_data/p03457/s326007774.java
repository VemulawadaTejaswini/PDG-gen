import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]t = new int[N+1];
			int[]x = new int[N+1];
			int[]y = new int[N+1];
			boolean possi = true;
			
			for(int i = 1;i<=N;i++) {
				t[i] = scan.nextInt();
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
			}
			
			for(int i = 0;i<N;i++) {
				int sa = t[i+1]-t[i];
				
				//System.out.println(sa);
				
				int saitan = Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
				//System.out.println(saitan);
				
				
				if(sa<saitan) {
					possi = false;
					break;
				}
				
				if((sa-saitan)%2==1) {
					possi = false;
					break;
				}
				
				
				
			}
			
			
			System.out.println(possi?"Yes":"No");
			
			
		}	
	}
}
