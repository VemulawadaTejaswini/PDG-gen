import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sr=new Scanner(System.in) ;
			int N=sr.nextInt();
			int a=0;
			if(N>=10) {
				 a=N%10;
			}else if(N<10) {
				 a=N;
			};

			if(a==3) {
				System.out.println("bon");
			}else if(a==0||a==1||a==6||a==8) {
				System.out.println("pon");
			}else {
				System.out.println("hon");
			}
			sr.close();

	}

}