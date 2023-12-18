import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		new Main().start();
	}

	void start() {
		final int MARU = 1;
		final int KAKU = 2;
		Scanner stdin = new Scanner(System.in);
		while (true) {
			String sentence = stdin.nextLine();

			if (!(sentence.length() == 1 && sentence.charAt(0) == '.')) {
				int maru = 0;
				int kaku = 0;
				int kind = 0;
				boolean isOk = true;

				Stack<Integer> stack = new Stack<Integer>();
				for (int i = 0; i < sentence.length(); i++) {
					if (sentence.charAt(i) == '(') {
						maru++;
						kind = MARU;
						stack.push(kind);
					} else if (sentence.charAt(i) == ')') {
						maru--;
						if(maru < 0){
							isOk = false;
							break;
						}
						int a = stack.pop();
						if(a != MARU){
							isOk = false;
							break;
						}
					} else if (sentence.charAt(i) == '[') {
						kaku++;
						kind = KAKU;
						stack.push(kind);

					} else if (sentence.charAt(i) == ']') {
						kaku--;
						if(kaku < 0){
							isOk = false;
							break;
						}
						int a = stack.pop();
						if( a != KAKU){
							isOk = false;
							break;
						}
					}
//					if (maru < 0 || kaku < 0) {
//						isOk = false;
//						break;
//					}
				}



				if (!stack.isEmpty()) {
					isOk = false;
				}
				if (isOk) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}else{
				break;
			}
		}
	}
}