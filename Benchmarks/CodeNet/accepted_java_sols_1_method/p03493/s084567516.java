import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        if (s.charAt(0) == '1') c++;
        if (s.charAt(1) == '1') c++;
        if (s.charAt(2) == '1') c++;
        System.out.println(c);
	}
}