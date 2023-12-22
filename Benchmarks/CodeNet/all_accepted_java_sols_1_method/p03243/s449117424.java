import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		if (n.charAt(0)==n.charAt(1)&&n.charAt(1)<n.charAt(2)) {
			int data = Character.getNumericValue(n.charAt(0))+1;
			System.out.print(data);
			System.out.print(data);
			System.out.print(data);
			System.out.println();
			System.exit(0);
		}

		if (n.charAt(0)==n.charAt(1)&&n.charAt(0)==n.charAt(2)) {
			System.out.println(n);
		}else{
			if (n.charAt(0)>=n.charAt(1)) {
				System.out.print(n.charAt(0));
				System.out.print(n.charAt(0));
				System.out.print(n.charAt(0));
				System.out.println();
			}else{
				int data = Character.getNumericValue(n.charAt(0))+1;
				System.out.print(data);
				System.out.print(data);
				System.out.print(data);
				System.out.println();
			}
		}

	}
}
