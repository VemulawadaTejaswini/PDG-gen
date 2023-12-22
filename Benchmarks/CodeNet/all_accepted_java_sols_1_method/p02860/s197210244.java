import java.util.Scanner;
public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
  int length = sc.nextInt();
		String r = sc.next();
	int oddeven = length % 2;
	if (oddeven == 0) {
		String right = r.substring(length/2);
		String left = r.substring(0, (length)/2 );
		if (left.equals(right)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	else {
		System.out.println("No");
	}
}
	}