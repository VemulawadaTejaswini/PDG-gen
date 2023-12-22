import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int count = A + B;
		int count_b = B;

		int i = 0;
		for (; i< S.length; i++) {
			if(S[i] == 'a'){
				count--;
				System.out.println("Yes");
			} else if(S[i] == 'b'){
				if(count_b != 0) {
					count--;
					count_b--;
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}

			if (count==0)break;

		}
		i++;
		for ( ;i< S.length; i++) {
			System.out.println("No");
		}

		sc.close();
	}

}
