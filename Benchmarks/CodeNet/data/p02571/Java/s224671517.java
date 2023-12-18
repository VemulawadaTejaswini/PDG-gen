import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		Reader reader=new Reader();
		int t=1;//sc.nextInt();
		while(t-->0) {
			String s1=reader.next();
			int n=s1.length();
			String s2=reader.next();
			int len=s2.length();
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n-len+1;i++) {
				String temp=s1.substring(i,i+len);
				int count=0;
				for(int j=0;j<temp.length();j++) {
					if(temp.charAt(j)!=s2.charAt(j)) count++;
				}
				min=Math.min(count, min);
			}
			System.out.println(min);
		}
	}
}
class Reader{
	BufferedReader reader;
	Reader(){
		reader=new BufferedReader(new InputStreamReader(System.in));
	}
	int nextInt() throws IOException{
		String in=reader.readLine().trim();
		return Integer.parseInt(in);
	}
	long nextLong() throws IOException{
		String in=reader.readLine().trim();
		return Long.parseLong(in);
	}
	String next() throws IOException{
		return reader.readLine().trim();
	}
	String[] stringArray() throws IOException{
		return reader.readLine().trim().split("\\s+");
	}
	int[] intArray() throws IOException{
		String[] inp=this.stringArray();
		int[] arr=new int[inp.length];
		int i=0;
		for(String s:inp) {
			arr[i++]=Integer.parseInt(s);
		}
		return arr;
	}
}
