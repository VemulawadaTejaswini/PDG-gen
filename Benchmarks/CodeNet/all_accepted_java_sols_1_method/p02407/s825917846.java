import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int x[] = new int[256];
		int n = scan.nextInt();
		for(i = 1; i <= n; i++) {
		 x[i] = scan.nextInt();
		}
		 for( i = n; i >= 1 ; i--){
			 System.out.print(x[i]);
			 if(i==1){
				 break;
			 }
			 System.out.print(" ");
		 }
		 System.out.println("");
		}
	}