import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int[] in=new int[10];
		for(int i=0;i<10;i++)
			in[i]=Integer.parseInt(reader.readLine());
		Arrays.sort(in);
		System.out.println(in[9]);
		System.out.println(in[8]);
		System.out.println(in[7]);
	
	}
}