/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}


	public static int[] fracMul(int a[], int b[]){
		int temp[]=new int[2];
		temp[0]=a[0]*b[0];
		temp[1]=a[1]*b[0];
		return temp;
	}
	public static int[] fracAdd(int a[], int b[]){
		int temp[]=new int[2];
		temp[0]=a[0]*b[1] + a[1]*b[0];
		temp[1]=a[1]*b[1];
		return temp;
	}


	

	static FastReader in;
	static StringBuilder output;
	static int m=998244353;
	
	public static int modPower(int x, int y) { 
		if(y==0){
			return 1;
		}
		long ans=x;
		for(int i=1;i<y;i++){
			ans*=x;
			ans=ans%m;
		}
		return (int)ans;
	}
	public static void main (String[] args) throws java.lang.Exception{
		out = new StringBuilder();
        in = new FastReader();
        String n=in.nextLine();
        char ch=n.charAt(n.length()-1);
        if(ch=='3'){
            System.out.println("bon");
        }else if(ch=='0' || ch=='1' || ch=='6' || ch=='8'){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
	}
}
