import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//Scanner reader=new Scanner(System.in);
		String s=reader.readLine();
		int in=Integer.parseInt(s);
		//int in=reader.nextInt();
		int[] out=new int[in];
		for(int i=1;i<=in;i++)out[i-1]=i;
		//in=reader.nextInt();
		s=reader.readLine();
		in=Integer.parseInt(s);
		for(int i=0;i<in;i++){
			String s1=reader.readLine();
			String[] in1=s1.split(",");
			int a=Integer.parseInt(in1[0]);
			int b=Integer.parseInt(in1[1]);
			int tmp=out[a-1];
			out[a-1]=out[b-1];
			out[b-1]=tmp;
		}
		for(int i=0;i<out.length;i++)System.out.println(out[i]);
	}
}