import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long A = scan.nextLong();
                double B = scan.nextDouble();
                double Ba = B*100;
                long Bb = (long)Ba;

                long ans1 = (A*Bb)/100;
                
                long answer = (long) ans1;
                System.out.println(answer);
                
                
        }
}