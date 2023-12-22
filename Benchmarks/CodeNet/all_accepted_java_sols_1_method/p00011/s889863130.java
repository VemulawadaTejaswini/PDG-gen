import java.util.*;
import java.io.*;
public class Main{
  public  static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String ad=br.readLine();
		String bd=br.readLine();
		int w = Integer.parseInt(ad);
		int n = Integer.parseInt(bd);
		int[] amida=new int[w+1];
		for(int i=1;i<=w;i++)
		    amida[i]=i;
		for(int i=0;i<n;i++){
		StringTokenizer st = new StringTokenizer(br.readLine(),",");
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int t=amida[a];
		amida[a]=amida[b];
		amida[b]=t;
		}
		for(int i=1;i<=w;i++)
		    System.out.println(amida[i]);
		
  }
    
}