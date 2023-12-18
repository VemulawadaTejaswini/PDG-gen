import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String line1[] = sc.nextLine().split("");
		String line2[] = sc.nextLine().split("");
		String kekka = "NO";
		if (line1[0].equals(line2[2]) && line1[1].equals(line2[1]) && line1[2].equals(line2[0])) {
			kekka = "YES";
		}
       System.out.println(kekka);
	}
}