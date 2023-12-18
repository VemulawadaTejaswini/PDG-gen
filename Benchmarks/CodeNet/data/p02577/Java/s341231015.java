import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String nis = sc.next();
	int now;
	int sum = 0;
	for (int i=0; i<nis.length(); i++) {
	    now = Character.getNumericValue(nis.charAt(i));
	    sum += now;
	}
	if (sum % 9 == 0) System.out.print("Yes");
	else { System.out.print("No"); }
    }
}
