import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		FScanner sc=new FScanner();
		int n=sc.readInt();
		double[] ta=sc.readDoubleL();
		double t=ta[0];
		double a=ta[1];
		double[] ht=sc.readDoubleL();
		double[] w=new double[n];
		
		for(int i=0; i<ht.length; i++){
			w[i]=Math.abs(a-(t-(ht[i]*0.006)));
		}
		
		int ans=0;
		double mx=Double.MAX_VALUE;
		
		for(int i=0; i<w.length; i++){
			if(mx>w[i]){
				mx=w[i];
				ans=i;
			}
		}
		System.out.println(ans+1);
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static void disp(String[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%s ",data[i]);
		}
			System.out.println();
	}
	
	static void disp(long[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		BufferedReader read=null;
		StringTokenizer tok=null;
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		boolean hasNextLine(){
			boolean has=true;
			if(!sc.hasNextLine()){
				has=false;
			}
			return has;
		}
		int readInt(){
			String buf=sc.nextLine();
			return Integer.parseInt(buf);
		}
		long readLong(){
			long i=Long.parseLong(sc.nextLine());
			return i;
		}
		int[] readIntL(){
			String[] buf=sc.nextLine().split(" ");
			int[] num=new int[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Integer.parseInt(buf[i]);
			}
			return num;
		}
		
		double[] readDoubleL(){
			String[] buf=sc.nextLine().split(" ");
			double[] num=new double[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Double.parseDouble(buf[i]);
			}
			return num;
		}
		
		String readString(){
			return sc.nextLine();
		}
		String[] readStringL(String dlm){
			String[] s=sc.nextLine().split(dlm);
			return s;
		}
	}
}
