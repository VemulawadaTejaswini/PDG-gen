import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		//BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str=br.readLine();
		int n=Integer.parseInt(str);
		String xstr=br.readLine();
		String ystr=br.readLine();
		String[] x=xstr.split(" ");
		String[] y=ystr.split(" ");
		
		int[] t=new int[n];
		
		for(double p=1;p<=4;p++){
			if(p==4)p=Double.POSITIVE_INFINITY;
		long ln=0;
		
		for(int i=0;i<n;i++){
			int l=Integer.parseInt(x[i]);
			int q=Integer.parseInt(y[i]);
		if(l>q)
		t[i]=l-q;
		else
		t[i]=q-l;
		ln+=Math.pow(t[i],p);
		}
		System.out.printf("%.8f%n",Math.pow(ln,(double)1/p));
		}
	
	}}