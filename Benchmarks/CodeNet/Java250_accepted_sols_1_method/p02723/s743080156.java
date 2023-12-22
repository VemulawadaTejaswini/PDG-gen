
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String T[]=S.split("");
		if(T[2].equals(T[3])&&T[4].equals(T[5])) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}