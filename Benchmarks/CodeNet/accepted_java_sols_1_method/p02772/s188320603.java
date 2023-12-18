import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int[] ai = new int[n];
	for(int i = 0; i < n; i++) {
		ai[i] = sca.nextInt();
	}

	boolean bool = true;
	for(int i = 0; i < n; i++) {
		if(ai[i] % 2 == 0) {
			if(ai[i] % 3 == 0 || ai[i] % 5 == 0) {
				continue;
			}
			else {
				bool = false;
				break;
			}
		}
	}

	if(bool == true) {
		System.out.println("APPROVED");
	}
	else {
		System.out.println("DENIED");
	}
	// ArrayList<String> list = new ArrayList<String>();
	// list.add("");

	// 後始末
	sca.close();
	}
}