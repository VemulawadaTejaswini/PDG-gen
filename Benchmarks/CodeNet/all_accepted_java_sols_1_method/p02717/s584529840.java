
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int  X = sc.nextInt();
		int  Y = sc.nextInt();
		int  Z = sc.nextInt();

		int w = X;
		X= Y;
		Y = w;

		w = X;
		X= Z;
		Z = w;

		System.out.print(X+" ");
		System.out.print(Y+" ");
		System.out.print(Z);

		}
	}





