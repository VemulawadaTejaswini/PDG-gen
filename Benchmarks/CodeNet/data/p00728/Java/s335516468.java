import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		int n=Integer.parseInt(s);
		if(n==0){System.exit(0);}
		int[] tensuu=new int[n];
		for(int i=0;i<n;i++){
			tensuu[i]=Integer.parseInt(reader.readLine());
		}
		Arrays.sort(tensuu);
		int sum=0;
		for(int j=1;j<n-1;j++){
			sum+=tensuu[j];
		}
		int ans=sum/(n-2);
		System.out.println(ans);
	}
}