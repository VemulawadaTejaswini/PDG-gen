import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// 3?????????????????°??\???
		while (true) {
			String input_line = input.readLine();
			String[] All_test_score = input_line.split(" ");
			// ??????????????????
			int interm_test_m = Integer.parseInt(All_test_score[0]);
			// ??????????????????
			int end_test_f = Integer.parseInt(All_test_score[1]);
			// ???????????????
			int return_test_r = Integer.parseInt(All_test_score[2]);
			// ???????????????????????????????¨?
			if (interm_test_m == -1 && end_test_f == -1 && return_test_r == -1) {
				break;
			}
			int total_m_f = interm_test_m + end_test_f;

			if (end_test_f==-1 || interm_test_m==-1||total_m_f<30 ) {
				System.out.println("F");
			} else if (total_m_f >= 80) {
				System.out.println("A");
			} else if (total_m_f >= 65 && total_m_f < 80) {
				System.out.println("B");
			} else if (total_m_f >= 50 && total_m_f < 65 || return_test_r >= 50) {
				System.out.println("C");
			} else  {
				System.out.println("D");
			}
		}

	}
}