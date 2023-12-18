import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
		long X = scan.nextLong();
                long money = 100;
                double m = 0;
                int year = 0;
                while(X>money){
                    m = money*1.01;
                    money = (long)m;
                    year++;
                }
                
                System.out.println(year);
	}
}