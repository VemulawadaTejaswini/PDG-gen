import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int [][]x = new int[3][3];
			
			x[0][0] = scan.nextInt();
			x[0][1] = scan.nextInt();
			x[0][2] = scan.nextInt();
			x[1][0] = scan.nextInt();
			x[1][1] = scan.nextInt();
			x[1][2] = scan.nextInt();
			x[2][0] = scan.nextInt();
			x[2][1] = scan.nextInt();
			x[2][2] = scan.nextInt();
			
			int[]a = new int[3];
			int[]b = new int[3];
			
			int ok = 1;
			
			
			for(int i = 0;i<=100;i++) {
				a[0] = i;
				b[0] = x[0][0]-a[0];
				
				a[1] = x[1][0]-b[0];
				a[2] = x[2][0]-b[0];
				b[1] = x[0][1]-a[0];
				b[2] = x[0][2]-a[0];
				if(0<=a[1]&&a[1]<=100&&0<=a[2]&&a[2]<=100&&0<=b[1]&&b[1]<=100&&0<=b[2]&&b[2]<=100) {
					if(a[1]+b[1]==x[1][1]&&a[1]+b[2]==x[1][2]&&a[2]+b[1]==x[2][1]&&a[2]+b[2]==x[2][2]){
						System.out.println("Yes");
						System.exit(0);
					}
				}
			}
			
			
			System.out.println("No");
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
