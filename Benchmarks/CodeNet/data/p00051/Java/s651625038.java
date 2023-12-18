import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			char[] c = sc.nextLine().toCharArray();
			Arrays.sort(c);
			String max = "";
			String min = "";
			for(int j = 0; j < c.length; j++){
				max += (c[j] + "");
				min += (c[c.length - j - 1] + "");
			}
			System.out.println(Integer.parseInt(max) - Integer.parseInt(min));
		}
	}
}