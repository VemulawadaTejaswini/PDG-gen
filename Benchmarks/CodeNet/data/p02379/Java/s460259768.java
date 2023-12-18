
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double a;
        double b;
        
        if(x1 < 0){
            x1 = x1 * -1;
        }if(x2 < 0){
            x2 = x2 * -1;
        }
        a = (x1 + x2)*(x1 + x2);
        b = (y1 + y2)*(y1 + y2);  
        
        double c = Math.sqrt(a*a+b*b);
        System.out.println(c);
        }
        
        
       
        
    }


