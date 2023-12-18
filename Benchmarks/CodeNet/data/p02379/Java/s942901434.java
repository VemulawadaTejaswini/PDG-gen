import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double x_len = Math.abs(x1 - x2);
        double y_len = Math.abs(y1 - y2);
        double out = Math.sqrt((x_len * x_len) + (y_len * y_len));
        System.out.println(out);
    }
}

