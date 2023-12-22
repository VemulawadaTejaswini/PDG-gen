import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char b = sc.next().charAt(0);
		if (b == 'A') System.out.println('T');
		else if (b == 'T') System.out.println('A');
		else if (b == 'C') System.out.println('G');
		else System.out.println('C');
	}

}