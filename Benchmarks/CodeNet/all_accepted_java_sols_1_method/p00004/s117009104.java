import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        while(stdIn.hasNext()){
            double a = stdIn.nextInt();
            double b = stdIn.nextInt();
            double c = stdIn.nextInt();
            double d = stdIn.nextInt();
            double e = stdIn.nextInt();
            double f = stdIn.nextInt();
            
            double x = (c * e - b * f) / (a * e - b * d);
            double y = (c * d - a * f) / (b * d - a * e);
			
            if(x == -0.0){
            	x = 0.0;
            }
            
            if(y == -0.0){
                y = 0.0;
            }
            
            System.out.printf("%.3f %.3f", x, y);
            System.out.println();
        }

        stdIn.close();
    }
}
