import java.util.Scanner;
public class Main {
	
	static int maxN = 10010;
	static int maxQ = 100001;
	
	static int arr[] = new int[maxN];
	
	
	private static int solve(int x) {
		if(arr[x] != x) {
			arr[x] = solve(arr[x]);
			
		} else {}
		
		return arr[x];
		
		
	}
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
		for(int i = 0; i< maxN; i++) {
			arr[i] = i;
			int n;
			int m;
			int com;
			int x;
			int y;
			
			n = scan.nextInt();
			m = scan.nextInt();
			
			while(m-- > 0) {
				com = scan.nextInt();
				x = scan.nextInt();
				y = scan.nextInt();
				if(com == 0) {
					arr[solve(x)] = solve(y);
				} else if (solve(x) == solve(y)){
						System.out.println("1");
					}
				 else{
					System.out.println("0");
				}
			}
			
		}
		
	}

}

