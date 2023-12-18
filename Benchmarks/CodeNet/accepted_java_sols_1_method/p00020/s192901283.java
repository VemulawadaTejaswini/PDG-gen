import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int[] go=new int[5];
		String aa="";

		try {
			str=bfr.readLine();
			str=str.toUpperCase();
			System.out.println(str);
		}catch(IOException e) {

		}
	}
}

