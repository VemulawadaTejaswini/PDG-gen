import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		String str = sc.next();
        String substr = str.substring(0, num);
		System.out.printf(substr + "...");
    }
}