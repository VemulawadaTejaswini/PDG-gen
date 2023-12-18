import java.io.*;
public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int a=Integer.parseInt(st[0]);
		int b=Integer.parseInt(st[1]);
		int t=a-b;
		if(t==0)System.out.println("a == b");
		else System.out.println(t<0?"a < b":"a > b");		
	}}