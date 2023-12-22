import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean f1=false,f2=false,f3=false,f4=false;


		for(int i=0;i<4;i++) {
			int n = sc.nextInt();
			if(n==1)f1=true;
			else if (n==9)f2=true;
			else if(n==7)f3=true;
			else if(n==4)f4=true;

		}
		if(f1&&f2&&f3&&f4)System.out.print("YES");
		else System.out.print("NO");

	}
}