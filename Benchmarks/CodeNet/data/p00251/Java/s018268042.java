import java.io.*;
public class sample {
	public static void main(String[] args){
		try{
		int a,b,c=0;
		for(a=0;a<10;a++){
			b=System.in.read();
			c+=b;
		}
		System.out.println(c);
		}catch(IOException e){}
		
			
		}
	}