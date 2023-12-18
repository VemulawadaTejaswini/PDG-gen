import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i;
		int n;
		String str;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(i=1; ;i++){
			str = in.readLine();
			n = Integer.parseInt(str);
			if(n==0) break;
			System.out.println("Case "+(i)+": "+n);
		}
	}
}