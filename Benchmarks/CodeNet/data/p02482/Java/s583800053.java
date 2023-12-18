import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] buf_strs = line.split(" ");
		int num1 = Integer.parseInt(buf_strs[0]);
		int num2 = Integer.parseInt(buf_strs[1]);
		
		if (num1 < num2) {
			System.out.println("a < b");
		} else if (num1 > num2){
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
	}

}