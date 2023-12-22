import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try{
			while(true){
				s	=	br.readLine();
				String[] str = s.split(" ");
				int a = (int)Integer.parseInt(str[0]);
				int b = (int)Integer.parseInt(str[2]);
				String op = str[1];

				if(op.equals("?")){ break; }
				if(op.equals("+")){ System.out.println(a+b); }
				if(op.equals("-")){ System.out.println(a-b); }
				if(op.equals("*")){ System.out.println(a*b); }
				if(op.equals("/")){
					if(b==0){ continue; }
					System.out.println((int)(a/b));
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}