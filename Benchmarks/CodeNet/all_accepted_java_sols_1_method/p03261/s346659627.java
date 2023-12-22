import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		boolean flag = true;

		String[] s = new String[N];

		int len = 0;

		for(int i=0;i<N;i++) {

			s[i] = sc.next();

			if(i > 0) len = s[i-1].length();

			if(i>0 && s[i].charAt(0) != s[i-1].charAt(len-1)) {

				System.out.println("No");

				flag = false;

				break;
			}

			for(int j=0;j<i;j++) {

				if(s[i].equals(s[j])) {

					System.out.println("No");

					flag = false;

					break;
				}
			}
		}

		if(flag == true) {

			System.out.println("Yes");
		}




	}

}
