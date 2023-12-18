import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str =  reader.next();
		int length = (str.length()-1) / 2 * 2;
		int ans = 0;
		for (int i = length; i > 0; i-=2) {
			boolean flag = true;
			for (int j = 0; j < i / 2; j++) {
				if (str.charAt(j) != str.charAt(j+i/2)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		reader.close();
	}


}



