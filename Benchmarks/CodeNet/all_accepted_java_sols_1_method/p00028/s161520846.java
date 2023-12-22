import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//Scanner reader=new Scanner(System.in);
		String s;//=reader.readLine();
		//int in=reader.nextInt();
		int[] in=new int[100];
		while((s=reader.readLine())!=null){
			int i=Integer.parseInt(s);
			in[--i]++;
		}
		int max=0;
		for(int i=1;i<=100;i++)if(in[i-1]>max)max=in[i-1];
		for(int i=1;i<=100;i++)if(in[i-1]==max)System.out.println(i);
		//System.out.println(max);
	}
}