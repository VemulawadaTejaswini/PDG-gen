import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		HashSet h=new HashSet();
		h.add(a);
		h.add(b);
		h.add(c);
		if(h.size()==2) System.out.println("Yes");
		else System.out.println("No");
	}

}
