import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class Main{
	static FastScanner fs=new FastScanner();
	static PrintWriter pw=new PrintWriter(System.out);
	static void Solve(long the){
		int n=fs.nextInt();
		int[] count=new int[10005];
		for(int i=0;i<10005;i++){
			count[i]=0;
		}
		for(int i=1;i<=100;i++){
			for(int j=1;j<=100;j++){
				for(int k=1;k<=100;k++){
					int x=(i*i)+(j*j)+(k*k)+(i*j)+(j*k)+(k*i);
					if(x>10000)	continue;
					count[x]++;
				}
			}
		}
		for(int i=1;i<=n;i++){
			pw.println(count[i]);
		}


		
	}
	public static void main(String args[]){
		long t=1;
		// t=fs.nextInt();
		for(long i=1;i<=t;i++){
			Solve(i);
		}
		pw.close();
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next(){
			while((!st.hasMoreTokens()) || (st==null)){
				try{
					st=new StringTokenizer(br.readLine());
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt(){
			return Integer.parseInt(next());
		}
		int[] readArray(int n){
			int[] a=new int[n];
			for(int i=0;i<n;i++)	a[i]=nextInt();
			return a;
		}
		long nextLong(){
			return Long.parseLong(next());
		}
		double nextDouble(){
			return Double.parseDouble(next());
		}
		String nextLine(){
			String str="";
			try{
				str=br.readLine();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}
}