import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		int a,b;
		String op;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String s = br.readLine();
			String[] st = s.split(" ");
			a = Integer.parseInt(st[0]);
			op = st[1];
			b = Integer.parseInt(st[2]);

			if(op.equalsIgnoreCase("+")){
				System.out.println(a+b);
			}else if(op.equalsIgnoreCase("-")){
				System.out.println(a-b);
			}else if(op.equalsIgnoreCase("*")){
				System.out.println(a*b);
			}else if(op.equalsIgnoreCase("/")){
				System.out.println(a/b);
			}else	break;
		}
	}

}