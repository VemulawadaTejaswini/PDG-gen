
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n%10;
		if(n1==2 || n1==4 || n1==5 || n1==7 || n1==9 ){
			System.out.println("hon");
		}else if(n1==0 || n1==1 || n1==6 || n1==8) {
			System.out.println("pon");
		}else {
			System.out.println("bon");
		}
		sc.close();
	}
}
