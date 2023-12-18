import java.io.*;

public class Compare {
	public static void main(String[] args) {
		String line;
		int a,b;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("input a:");
			line = reader.readLine();
			a = Integer.parseInt(line);
			System.out.println("input b:");
			line = reader.readLine();
			b = Integer.parseInt(line);
			if(a==b) {
				System.out.println("a == b");
			}else if(a>b){
				System.out.println("a > b");
			}else {
				System.out.println("a < b");
			}
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
