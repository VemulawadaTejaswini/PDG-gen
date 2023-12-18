import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int amari = 0;
		
		for(int i=1000;i<=10000;i=i+1000) {
			if(N<=i) {
			 amari = i-N;
			 break;
			}
		}
		System.out.println(amari);
		sc.close();
	}

}