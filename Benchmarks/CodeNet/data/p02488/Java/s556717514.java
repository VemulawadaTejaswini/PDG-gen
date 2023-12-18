import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = sc.nextInt();
		int[] num = new int[n];
		String[] str = new String[n];
		String ans;

		for(int i = 0; i < num.length; i++)
			try {
				str[i] = reader.readLine();
			} catch(IOException e) {
				System.out.println(e);
			}

		ans = str[0];
		for(int i = 1; i < num.length; i++)
			if(ans.compareTo(str[i]) > 0)
				ans = str[i];

		System.out.println(ans);
	}
}