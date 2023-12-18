import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] C = S.toCharArray();

        String ans = String.valueOf(C[0]) + (C.length - 2) + String.valueOf(C[(C.length - 1)]); 

        System.out.println(ans);
	}
}
