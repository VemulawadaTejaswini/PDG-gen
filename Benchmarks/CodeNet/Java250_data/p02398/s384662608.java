import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		int sum = 0;
		
		String[] str = br.readLine().split("\\s+");
		
		if (str.length == 3) {
			try {
				a = Integer.parseInt(str[0]);
				b = Integer.parseInt(str[1]);
				c = Integer.parseInt(str[2]);
				
				for (int i = a; i <= b; i++) {
					if (Math.floorMod(c, i) == 0) {
						sum++;
					}
				}
				
				System.out.println(sum);
				
			} catch(Exception NumberFormatException) {
			}
		}
	}
}