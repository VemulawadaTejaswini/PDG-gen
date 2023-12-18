import java.io.*;
public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ope;
		int a,b;
		String[] st=new String[3];
		while(true){
		st=br.readLine().split(" ");
		a=Integer.parseInt(st[0]);
		b=Integer.parseInt(st[2]);
		ope=st[1].charAt(0);
		if(ope=='?')break;
		System.out.println(keisan(a,b,ope));}
		}

		static int keisan(int a,int b,char operator){
		int result=0;
		switch(operator){
		case '+':result=a+b;break;
		case '-':result=a-b;break;
		case '*':result=a*b;break;
		case '/':result=a/b;break;
		}
		return (int)result;
		}
		}
		