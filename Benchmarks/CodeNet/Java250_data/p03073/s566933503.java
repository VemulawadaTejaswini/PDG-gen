import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			char[] s = in.next().toCharArray();
			
			int s_10_counter = 0;
			int s_01_counter = 0;
			
			
			for (int i = 0; i < s.length; i++) {
				if (i%2 == 1) {
					if (s[i] == '1') s_10_counter++;
					else s_01_counter++;
				} else {
					if (s[i] == '0') s_10_counter++;
					else s_01_counter++;
				}
			}
			
			System.out.println(s.length - Math.max(s_10_counter, s_01_counter));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}