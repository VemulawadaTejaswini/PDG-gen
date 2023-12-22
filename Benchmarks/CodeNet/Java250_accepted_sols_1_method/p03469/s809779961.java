import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		str=bfr.readLine();
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.setCharAt(3,'8');
		System.out.println(sb.toString());
	}
}