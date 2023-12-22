import java.util.Scanner;
//import java.lang.Math;

class Main{
	
	public static void main(String[] arg){
	
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x =new int[n];
		int[] y =new int[n];
		
		for(int i=0;i<n;i++){
			
			x[i]=sc.nextInt();
		}
         for(int i=0;i<n;i++){
			
			y[i]=sc.nextInt();
		}
         
         double sum=0;
         double sum2=0;
         double sum3=0;
        
         double X=0;
         
         for(int i=0;i<n;i++){
        	 
        	
        	sum+=Math.abs(x[i]-y[i]);
        	sum2+=Math.pow(Math.abs(x[i]-y[i]),2);//P=2
        	sum3+=Math.pow(Math.abs(x[i]-y[i]),3);//P=3
        	X=Math.max(X, Math.abs(x[i]-y[i]));//P=無限
        	
        	
        	
         }      double smt=Math.sqrt(sum2);
        	double smt2=Math.cbrt(sum3);
        	
        	System.out.printf("%f\n",sum);
        	System.out.printf("%f\n",smt);
        	System.out.printf("%f\n",smt2);
        	System.out.printf("%f\n",X);
        	
        	
        	
        	
        	
        	}
}
