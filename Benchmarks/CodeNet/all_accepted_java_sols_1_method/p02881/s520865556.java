import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
      	double B = Math.sqrt(A);
        long a = (long)A;
        long b = (long)B;
        for(long i=b;i>=1;i--){
          if(a%i==0){System.out.println((a/i + i - 2));break;}
        }
    }
}