
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		if(N==1 || N==2 || N==3 || N==5 || N==6 || N==9 || N==10 || N==13 || N==17) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}