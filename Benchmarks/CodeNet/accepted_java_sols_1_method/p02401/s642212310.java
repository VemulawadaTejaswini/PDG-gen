import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String st = br.readLine();
			String[] str = st.split(" ");
			int a = Integer.parseInt(str[0]);
			String op = str[1];
			int b = Integer.parseInt(str[2]);
			if ("?".equals(op)) {
				break;
			}
			if("+".equals(op)){
				System.out.println(a + b);
			}else if("-".equals(op)){
				System.out.println(a - b);
			}else if("*".equals(op)){
				System.out.println(a * b);
			}else if("/".equals(op)){
				System.out.println(a / b);
			}
		}
	}
}