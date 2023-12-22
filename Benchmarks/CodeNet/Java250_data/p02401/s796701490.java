import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	while(true){
		String str=input.readLine();
		String[] atr=str.split(" ");
		int a=Integer.parseInt(atr[0]);
		String op=atr[1];
		int b=Integer.parseInt(atr[2]);
		if(op.equals("+")){
			System.out.println(a+b);
		}
		else if(op.equals("-")){
			System.out.println(a-b);
		}
		else if(op.equals("*")){
			System.out.println(a*b);
		}

		else if(op.equals("/")){
			System.out.println(a/b);
		}
		else if(op.equals("?")){
			break;
			}
			

		}
	
		
	}
}