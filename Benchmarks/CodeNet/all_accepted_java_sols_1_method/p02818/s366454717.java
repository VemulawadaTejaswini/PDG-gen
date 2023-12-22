import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n1 = scn.nextLong();
		long n2 = scn.nextLong();
		long n3 = scn.nextLong();
		if(n1>=n3) {
			n1 = n1-n3;
			n3 = 0;
		} else {
			n3 = n3-n1;
			n1 = 0;
		}
		if(n2>=n3) {
			n2 = n2-n3;
			n3 = 0;
		} else {
			n3 = n3-n1;
			n2 = 0;
		}
		System.out.println(n1+" "+n2);
		scn.close();
	}
}