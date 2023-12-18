import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] str = line.split(" ");

		int[] a = new int[str.length];
		for (int i=0; i<str.length; i++) {
		 	a[i] = Integer.parseInt(str[i]);
		 } 

		 Arrays.sort(a);
		 int ans = a[0];

		 for (int i=1; i<a.length; i++) {
		 	if (ans % a[i] == 0)
		 		continue;
		 	ans *= a[i];
		 }

		 System.out.println(ans);

		br.close();
	}
}