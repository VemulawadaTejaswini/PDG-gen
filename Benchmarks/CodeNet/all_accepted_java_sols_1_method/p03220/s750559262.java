import java.util.*;

class Main{
	public static void main(String[] args){
		   double t2=700;
		Scanner sc=new Scanner(System.in);
		     int N=sc.nextInt();
		     int T=sc.nextInt();
		     int A=sc.nextInt();
		     int res = 0;
     	     for(int i = 0; i < N; i++) {
     	     	int H = sc.nextInt();
		    	double t1=T-H*0.006-A;
               if(t1*t1<t2*t2){
                 t2=t1;
                 res = i + 1;
              }
		   }
		    System.out.print(res);
	}
}