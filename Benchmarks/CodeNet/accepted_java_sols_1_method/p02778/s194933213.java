import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		
		for(int i=0;i<str.length();i++)
			System.out.print("x");
	}
}