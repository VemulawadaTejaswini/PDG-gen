import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().start();
	}

	void start() {
		Scanner stdin = new Scanner(System.in);
		while (true) {
			String sentence = stdin.nextLine();

			if (!(sentence.length() == 1 && sentence.charAt(0) == '.')) {
				int maru = 0;
				int kaku = 0;
				int kind = 0;
				final int MARU = 1;
				final int KAKU = 2;
				boolean isOk = true;
				for (int i = 0; i < sentence.length(); i++) {
					if (sentence.charAt(i) == '(') {
						maru++;
						kind = MARU;
					} else if (sentence.charAt(i) == ')') {
						maru--;
						if (kind == KAKU) {
							isOk = false;
							break;
						}
						if(kind == MARU){
							kind = 0;
						}
					} else if (sentence.charAt(i) == '[') {
						kaku++;
						kind = KAKU;
					} else if (sentence.charAt(i) == ']') {
						kaku--;
						if (kind == MARU) {
							isOk = false;
							break;
						}
						if(kind == KAKU){
							kind = 0;
						}
					}
					if (maru < 0 || kaku < 0) {
						isOk = false;
						break;
					}
				}

				if (isOk && (maru != 0 || kaku != 0)) {
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