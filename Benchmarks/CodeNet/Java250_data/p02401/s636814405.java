import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


class Main {
	public static void main(String[] args) throws IOException {
		DecimalFormat df1 = new DecimalFormat("0.000000");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> ss = new ArrayList<String>();
		while(true){
			String s = new String(in.readLine());
			if(s.split(" ")[1].equals("?")){
				break;
			}
			ss.add(s);
		}
		for(String s :ss){
			String[] sss = s.split(" ");
			int a = Integer.parseInt(sss[0]);
			int b = Integer.parseInt(sss[2]);
			if(sss[1].equals("+")){
				System.out.println(a+b);
			}
			else if(sss[1].equals("-")){
				System.out.println(a-b);
			}
			else if(sss[1].equals("*")){
				System.out.println(a*b);
			}
			else {
				System.out.println(a/b);
			}
		}
	}

}