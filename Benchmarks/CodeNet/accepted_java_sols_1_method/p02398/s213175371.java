import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int c = Integer.parseInt(strs[2]);
		
		int count = 0;
		
		for(int i=1; i<=c; i++) {
			if(a<=i && i<=b) {
				if(c%i==0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}