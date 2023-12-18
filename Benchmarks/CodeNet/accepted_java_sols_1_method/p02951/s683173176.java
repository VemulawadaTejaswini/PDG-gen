import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		if(C-(A-B)<0)
			System.out.println(0);
		else
			System.out.println(C-(A-B));
	}
}