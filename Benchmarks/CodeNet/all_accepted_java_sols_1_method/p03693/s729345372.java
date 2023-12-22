import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		int r=scan.nextInt();
		int g=scan.nextInt();
		int b=scan.nextInt();

		int q=0;


		if(r>=1 && r<=9 && g>=1 && g<=9 && b>=1 && b<=9 ) {
			r=r*100;
			g=g*10;

			q=r+g+b;
			if(q%4==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}



		}else{


		}




	}

}