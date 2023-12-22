import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		int n=Integer.parseInt(s);
		for(int j=0;j<n;j++){
			s=reader.readLine();
			String t[] =s.split(" ");
			int[] in=new int[t.length];
			for(int i=0;i<t.length;i++)
				in[i]=Integer.parseInt(t[i]);
			Arrays.sort(in);
			String ans;
			if(in[0]*in[0]+in[1]*in[1]==in[2]*in[2])
				ans="YES";
			else ans="NO";
			System.out.println(ans);
		}
	
	}
}