import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long A = scan.nextLong();
                double B = scan.nextDouble()+0.001;
                long x = (long)B;
                double B1 = (B-x)*10;
                long y = (long)B1;
                double B2 = (B1-y)*10;
                long z = (long)B2;

                long ans1 = (A*(100*x+10*y+z))/100;
                System.out.println(ans1);
        }
}