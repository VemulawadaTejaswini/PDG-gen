import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String in=br.readLine();
			String[] s=in.split(" ");
			int a=Integer.parseInt(s[0]);
			String op=s[1];
			int b=Integer.parseInt(s[2]);
			switch(op){
			case "+":System.out.println(a+b);break;
			case "-":System.out.println(a-b);break;
			case "*":System.out.println(a*b);break;
			case "/":System.out.println(a/b);break;
			case "?":return;
			}
		}
	}
}