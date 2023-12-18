import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int[] p = new int[5000];
		int n,s,m;
		while((n=Integer.parseInt(bf.readLine()))!=0){
			for(int i=0;i<n;i++)p[i]=Integer.parseInt(bf.readLine());m=p[0];
			for(int i=0;i<n;i++){for(int j=i;j<n;j++){s=0;for(int k=i;k<=j;k++)s+=p[k];if(s>m)m=s;}}
			System.out.println(m);
		}
	}
}