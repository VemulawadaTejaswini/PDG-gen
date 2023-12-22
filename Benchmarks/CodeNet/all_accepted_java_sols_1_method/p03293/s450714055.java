import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str1 = sc.next().toCharArray();
		char[] str2 = sc.next().toCharArray();
		if(str1.length != str2.length) {
			System.out.println("No");
			return;
		}

		for(int i = 0; i < str1.length; i++) {
			boolean bo = true;
			for(int j = 0; j < str1.length; j++) {
				if(str1[(i+j)%str1.length] != str2[j]) {
					bo = false;
					break;
				}
			}
			if(bo) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
