import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(line);
		int ans = 0;
		int piv;
		int con;
		boolean isNotDivFlg;
		for (int i = 0; i < len; i++) {
			piv = line[i];
			con = i - 1;
			isNotDivFlg = false;
			while (con >= 0) {
				if (piv % line[con] == 0) {
					isNotDivFlg = false;
					break;
				}else if (piv % line[con] != 0){
					isNotDivFlg = true;
				}
				con--;
			}
			if (isNotDivFlg) {
				ans++;
			}

		}
		if (line[0] != line[1]) {
			ans++;
		}
		System.out.println(ans);

	}


}
