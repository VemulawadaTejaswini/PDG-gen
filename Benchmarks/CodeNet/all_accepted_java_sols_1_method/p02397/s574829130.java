import java.io.*;
public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
		String[] st=br.readLine().split(" ");
		int a=Integer.parseInt(st[0]);
		int b=Integer.parseInt(st[1]);
		if(a==0&&b==0)break;
		System.out.println(Math.min(a, b)+" "+Math.max(a, b));
		}
	}}