import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(!(n==0)){
        String str=br.readLine();
        int[] in=new int[n];double sum=0;
        Scanner sc=new Scanner(str);
        for(int i=0;i<n;i++){
        	
        	in[i]=sc.nextInt();
        	sum+=in[i];
        	  }
        double m=sum/n;
        
        
        double t=0;
        for(int i:in){
       	t+=Math.pow(i-m,2);
        	
        }
        double ar=Math.sqrt(t/n);
        System.out.printf("%.8f%n",ar);
        n=Integer.parseInt(br.readLine());
}
}}