import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N--!=0){
			String str = cin.next();
			char[] s = str.toCharArray();
			Arrays.sort(s);
			char[] max = new char[8];
			for(int i = 0; i < 8;i++){
				max[i]=s[7-i];
			}
			int MAX = Integer.parseInt(String.valueOf(max));
			int MIN = Integer.parseInt(String.valueOf(s));
			System.out.println(MAX-MIN);
		}
	}

}