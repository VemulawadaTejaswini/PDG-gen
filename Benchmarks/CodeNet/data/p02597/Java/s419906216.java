import java.util.*;

public class Main {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		String st = sc.next();
		sc.close();

		char[] chars = st.toCharArray();

		for (int i = 0; i < N; i++) {
			if (chars[i] == 'W') {
				for (int j = chars.length-1; j > i; j--) {
					if (chars[j] == 'R') {
						char temp = chars[i];
						chars[i] = chars[j];
						chars[j] = temp;
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);	
	}
}