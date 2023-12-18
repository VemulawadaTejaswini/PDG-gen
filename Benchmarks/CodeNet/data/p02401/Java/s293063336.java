import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int[] n = new int[5];
		String[] str = new String[5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			str = in.readLine().split(" ");
			n[0] = Integer.parseInt(str[0]); 
			String op = str[1];
			n[2] = Integer.parseInt(str[2]);
			if("?".equals(op)) break;
			switch(str[1]){
				case "+": n[3]=n[0]+n[2]; break;
				case "-": n[3]=n[0]-n[2]; break;
				case "*": n[3]=n[0]*n[2]; break;
				case "/": n[3]=n[0]/n[2]; break;
			}
			System.out.println(n[3]);
		}
	}
}