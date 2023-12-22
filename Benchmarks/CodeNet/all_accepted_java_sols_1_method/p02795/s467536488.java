import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String Str1 = scan.next();
		String Str2 = scan.next();
		String Str3 = scan.next();
		long H = Long.parseLong(Str1);
		long W = Long.parseLong(Str2);
		long N = Long.parseLong(Str3);
		long answer  = 0;
		if(W > H) {
			for(int i = 0; W > i ; i++) {
				N = N - W;
				if(N <= 0) {
					answer = i+1;
					break;
				}
			}
			if(N > 0) {
			for(int i = 0; H > i ; i++) {
				N = N - H;
				if(N <= 0) {
					answer = i+1;
					break;
				}
			}
			}
		}else{
				for(int i = 0; H > i ; i++) {
					N = N - H;
					if(N <= 0) {
						answer = i+1;
						break;
					}
			}
				if(N > 0) {
				for(int i = 0; W > i ; i++) {
					N = N - W;
					if(N <= 0) {
						answer = i+1;
						break;
					}
				}
			}
		}
		System.out.print(answer);

		}
	}

