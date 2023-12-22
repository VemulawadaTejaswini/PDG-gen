import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		StringBuilder S = new StringBuilder(sc.next());
		S.setCharAt(A - 1, 'A');
		S.setCharAt(B - 1, 'B');
		
		if(A < B) {
			if(C < D) {
				int now = B;
				while(now < D) {
					if(S.charAt(now) == '.') {
						now++;
					} else if(S.charAt(now + 1) == '.') {
						now += 2;
					} else {
						System.out.println("No");
		//				System.out.println(1);
						return;
					}
				}
				S.setCharAt(B - 1, '.');
				now = A;
				while(now < C) {
					if(S.charAt(now) == '.') {
						now++;
					} else if(S.charAt(now + 1) == '.') {
						now += 2;
					} else {
						System.out.println("No");
			//			System.out.println(2);
						return;
					}
				}
				System.out.println("Yes");
			} else {
				int now = B;
				while(S.charAt(now - 2) == '#' || S.charAt(now) == '#') {
					if(S.charAt(now) == '.') {
						now++;
					} else if(S.charAt(now + 1) == '.') {
						now += 2;
					} else {
						System.out.println("No");
			//			System.out.println(3);
						return;
					}
					if(now == D) {
						S.setCharAt(now - 1, 'B');
						break;
					}
				}
				S.setCharAt(now - 1, 'B');
				S.setCharAt(B - 1, '.');
				now = A;
				while(now < C) {
					if(S.charAt(now) == '.') {
						now++;
					} else if(S.charAt(now + 1) == '.') {
						now += 2;
					} else {
						System.out.println("No");
				//		System.out.println(4);
						return;
					}
				}
				System.out.println("Yes");
			}
		} else {
			if(C > D) {
				int now = A;
				while(now < C) {
					if(S.charAt(now) == '.') {
						now++;
					} else if(S.charAt(now + 1) == '.') {
						now += 2;
					} else {
						System.out.println("No");
			//			System.out.println(5);
						return;
					}
				}
				S.setCharAt(A - 1, '.');
				now = B;
				while(now < D) {
					if(S.charAt(now) == '.') {
						now++;
					} else if(S.charAt(now + 1) == '.') {
						now += 2;
					} else {
						System.out.println("No");
				//		System.out.println(6);
						return;
					}
				}
				System.out.println("Yes");
			} else {
				int now = A;
				while(S.charAt(now - 2) == '#' || S.charAt(now) == '#') {
					if(S.charAt(now) == '.') {
						now++;
					} else if(S.charAt(now + 1) == '.') {
						now += 2;
					} else {
						System.out.println("No");
	//					System.out.println(7);
						return;
					}
					if(now == C) {
						S.setCharAt(now - 1, 'A');
						break;
					}
				}
				S.setCharAt(now - 1, 'A');
				S.setCharAt(A - 1, '.');
				now = B;
				while(now < D) {
					if(S.charAt(now) == '.') {
						now++;
					} else if(S.charAt(now + 1) == '.') {
						now += 2;
					} else {
						System.out.println("No");
		//				System.out.println(8);
						return;
					}
				}
				System.out.println("Yes");
			}
		}
	}
}
