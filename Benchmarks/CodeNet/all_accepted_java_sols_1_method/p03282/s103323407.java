import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		final long K = sc.nextLong();
		char[] chars = s.toCharArray();

        for(int i = 0; i < K && i < chars.length; i++) {
            if (chars[i] != '1') {
            	System.out.println(chars[i]);
            	return;
			}
        }
        System.out.println("1");
	}
}