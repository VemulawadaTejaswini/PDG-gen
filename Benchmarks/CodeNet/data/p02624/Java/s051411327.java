import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		long res = 0;
		for(int i = 1;i<=n;i++){
			int  p = n/i;
			res += ((p*(p+1))/2)*i;
		}
		System.out.println(res);
		}
}