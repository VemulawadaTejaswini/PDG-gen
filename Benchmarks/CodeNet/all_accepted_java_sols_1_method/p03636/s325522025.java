import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        int len = input.length() - 2;
        String result = input.substring(0,1) + len + input.charAt(input.length()-1);
        System.out.println(result);
    }
}