import java.util.Scanner;

public class Main{
	
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		System.out.println(b-a==c-b?"YES":"NO");
	}
}
