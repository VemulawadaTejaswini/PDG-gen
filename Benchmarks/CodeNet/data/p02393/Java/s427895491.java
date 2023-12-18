import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		String[] str2=str.split(" ");
		int a=Integer.parseInt(str2[0]);
		int b=Integer.parseInt(str2[1]);
		int c=Integer.parseInt(str2[2]);
		if(a<b&&b<c){
			System.out.println(a+" "+b+" "+c);
		}else if(a<c&&c<b){
			System.out.println(a+" "+c+" "+b);			
		}
		else if(b<c&&c<a){
			System.out.println(b+" "+c+" "+a);			
		}
		
		else if(b<a&&a<c){
			System.out.println(b+" "+a+" "+c);			
		}
		else if(c<a&&a<b){
			System.out.println(c+" "+a+" "+b);			
		}
		
		else if(c<b&&b<a){
			System.out.println(c+" "+b+" "+a);			
		}
	}
}