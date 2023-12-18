import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String[] str = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		int cnt = 0;
		for (int i = a; i <= b; i++) cnt += (c % i) == 0 ? 1 : 0;
				
		System.out.println(cnt);
	}
}