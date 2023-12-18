import java.util.Scanner;
public class Main {
	 public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        double[] score;
	        score= new double[1000];
	        double sum;
	        while(true){
	        	int n=sc.nextInt();
	        	if(n==0) break;
	        	sum=0;
	        	for(int i=0;i<n;i++){
	        		score[i]=sc.nextDouble();
	        		sum=sum+score[i];
	        	}
	        	double ave=sum/(double)n;
	        	double a=0;
	        	for(int j=0;j<n;j++){
	        	a=a+((score[j]-ave)*(score[j]-ave));
	        	}
	        	a=a/n;
	        	
	        	double ans=Math.sqrt(a);
	  
	        	System.out.println(ans);
	        }
	        	
	        	
	        }
}