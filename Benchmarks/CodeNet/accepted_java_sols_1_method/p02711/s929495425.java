import java.util.Scanner;

public class Main {
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		String w = scan.nextLine();
		String a = w.substring(0,1);
		String b = w.substring(1,2);
		String c = w.substring(2,3);
		String ans = "7";

			if (a.equals(ans)){
				System.out.println("Yes");
			}else if (b.equals(ans)){
				System.out.println("Yes");
			}else if (c.equals(ans)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
		}
	}
}