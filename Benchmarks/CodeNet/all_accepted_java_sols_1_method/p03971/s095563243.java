import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		char[] sInfo = new char[N];
		for(int i = 0; i < N; i++) {
			sInfo[i] = S.charAt(i);
		}

		int passingPeople = 0;
		int foreignRank = 1;
		for(int i = 0; i < N; i++) {
			if(sInfo[i] == 'c') {
				System.out.println("No");
			} else if(sInfo[i] == 'a' && passingPeople < A+B) {
				System.out.println("Yes");
				passingPeople++;
			} else if(sInfo[i] == 'b' && passingPeople < A+B && foreignRank <= B) {
				System.out.println("Yes");
				passingPeople++;
				foreignRank++;
			} else {
				System.out.println("No");
			}
		}
	}
}