import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		char C=stdIn.next().charAt(0);
		int a=C-'a';a++;
		System.out.println((char)(a+'a'));
	}
}
