import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s1 = sc.next().toCharArray();
		char[] s2 = sc.next().toCharArray();
		sc.close();
		int count = 0;
		for(int i = 0; i < s1.length; i++) {
			if(s1[i] != s2[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}