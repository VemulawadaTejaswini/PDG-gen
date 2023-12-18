import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		for(int i=3;i<=n;i++){
			if(i%3 == 0 || i/10 == 3 || i/100==3 || i/1000==3){
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
}