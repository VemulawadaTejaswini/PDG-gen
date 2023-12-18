import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		int in=Integer.parseInt(s);
		int out=100000;
		for(int i=0;i<in;i++){
			out*=1.05;
			if(out%1000!=0){
				out-=out%1000;
				out+=1000;
			}
		}
		System.out.println(out);
	}
}