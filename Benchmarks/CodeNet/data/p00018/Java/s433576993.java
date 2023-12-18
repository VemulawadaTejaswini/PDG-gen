import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		String ans="";
		int[] n;
		int number;
		while((s=reader.readLine())!=null){
			t=s.split(" ");
			number=t.length;
			n=new int[number];
			for(int i=0;i<number;i++){
				n[i]=Integer.parseInt(t[i]);
			}
			Arrays.sort(t);
			for(int j=number-1;j>=0;j--){
				ans+=(t[j]+" ");
			}
		System.out.println(ans);
		ans="";
		}
	}
}