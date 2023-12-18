import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++){
			str[i] = sc.next();
		}
		Arrays.sort(str);
		String res = "";
		for(int i=0; i<n; i++){
			res += str[i];
		}
		sc.close();
		System.out.println(res);
	}
}