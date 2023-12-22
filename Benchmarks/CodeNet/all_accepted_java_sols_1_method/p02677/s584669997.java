import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                double A = scan.nextInt();
                double B = scan.nextInt();
                double H = scan.nextInt();
                double M = scan.nextInt();
                
                double hour = 30*H + 0.5*M;
                double min = 6*M;
                
                double kakudo = Math.abs(hour-min);
                
                if(kakudo>=180){
                    kakudo = 360 - kakudo;
                }
                
                double kaku = (kakudo * Math.PI)/180;
                
                double ans = Math.sqrt(A*A+B*B-2*A*B*Math.cos(kaku));
                        
                System.out.println(ans);
        }
}
