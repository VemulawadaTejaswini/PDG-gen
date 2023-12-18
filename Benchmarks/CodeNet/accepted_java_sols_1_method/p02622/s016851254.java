
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String t=br.readLine();
		int ans=0;
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)!=t.charAt(i))
			ans++;
		}
		System.out.println(ans);
	}
}
