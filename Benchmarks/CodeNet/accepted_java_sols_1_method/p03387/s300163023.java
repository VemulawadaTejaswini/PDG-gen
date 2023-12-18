import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int cnt = 0;
		if(!(A % 2 == B % 2 && B % 2 == C % 2)) {
			if(A % 2 != B % 2 && A % 2 != C % 2) {
				B++;
				C++;
				cnt++;
			} else if(A % 2 != B % 2 && B % 2 != C % 2) {
				A++;
				C++;
				cnt++;
			} else {
				A++;
				B++;
				cnt++;
			}
		}
		
		if(A >= B && A >= C) {
			cnt += ((A - B) / 2) + ((A - C) / 2);
		} else if(B >= A && B >= C) {
			cnt += ((B - A) / 2) + ((B - C) / 2);
		} else {
			cnt += ((C - A) / 2) + ((C - B) / 2);
		}
		System.out.println(cnt);
	}
}
