import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author yuki
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			int[] len = new int[3];
			for (int j = 0; j < 3; j++) {
				len[j] = scanner.nextInt();
			}
			Arrays.sort(len);
			if (len[0]*len[0]+len[1]*len[1]==len[2]*len[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}