import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		int[] p = new int[101];int m=1;
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;
		for(int i=0;i<=100;i++)p[i]=0;
		while((t=bf.readLine())!=null)p[Integer.parseInt(t)]++;
		for(int i=1;i<=100;i++)if(p[m]<p[i])m=i;
		m=p[m];for(int i=1;i<=100;i++)if(p[i]==m)System.out.println(i);
	}
}