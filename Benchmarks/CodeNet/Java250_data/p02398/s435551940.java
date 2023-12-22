import java.io.*;
public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int a=Integer.parseInt(st[0]);
		int b=Integer.parseInt(st[1]);
		int c=Integer.parseInt(st[2]);
		int count=0;
		for(int i=a;i<=b;i++){
			if(c%i==0)count++;
		}System.out.println(count);
		}}