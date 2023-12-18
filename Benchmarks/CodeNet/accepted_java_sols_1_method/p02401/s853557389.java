import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		String[] text=str.split(" ");
		int a=Integer.parseInt(text[0]);
		String b=text[1];
		int c=Integer.parseInt(text[2]);
		
		while (b.equals("?") == false){
				if(b.equals("+")){
				System.out.println(a+c);
			}else if(b.equals("-")){
				System.out.println(a-c);
			}else if(b.equals("*")){
				System.out.println(a*c);
			}else if(b.equals("/")){
				System.out.println(a/c);
			}
			str=br.readLine();
			text=str.split(" ");
			a=Integer.parseInt(text[0]);
			b=text[1];
			c=Integer.parseInt(text[2]);
		}
	}
}