import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		if(A<6)
			System.out.println(0);
		if(6<=A&&A<=12)
			System.out.println(B/2);
		if(13<=A)
			System.out.println(B);
	}
}