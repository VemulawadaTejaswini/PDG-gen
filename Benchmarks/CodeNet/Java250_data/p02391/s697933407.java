import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		String[] str2=str.split(" ");
		int a=Integer.parseInt(str2[0]);
		int b=Integer.parseInt(str2[1]);
		if(a<b){
		System.out.println("a < b");
		}
		if(a>b){
		System.out.println("a > b");
		}
		if(a==b){
		System.out.println("a == b");
		}
		
		
	}
}