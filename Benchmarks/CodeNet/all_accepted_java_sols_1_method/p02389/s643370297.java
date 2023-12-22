
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int ans1 = a*b;
			int ans2 = 2*a+2*b;
			
			System.out.print(ans1+" ");
			System.out.println(ans2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}