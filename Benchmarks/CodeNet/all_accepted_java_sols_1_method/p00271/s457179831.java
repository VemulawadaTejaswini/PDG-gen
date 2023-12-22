import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n,m,max,min;
		for(int i=0;i<7;i++){
			n = scan.nextInt();
			m = scan.nextInt();
			
			max = Math.max(n,m);
			min = Math.min(n,m);
			
			System.out.println(max-min);
		}
	}
}