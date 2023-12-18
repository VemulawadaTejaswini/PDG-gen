import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		double W=stdIn.nextDouble();
		double H=stdIn.nextDouble();
		int X=stdIn.nextInt();
		int Y=stdIn.nextInt();
		if(W%2==0&&H%2==0){
			if(W/2==X&&H/2==Y)
				System.out.println(W*H/2+" "+1);
			else
				System.out.println(W*H/2+" "+0);
		}
		else
			System.out.println(W*H/2+" "+0);
	}
}