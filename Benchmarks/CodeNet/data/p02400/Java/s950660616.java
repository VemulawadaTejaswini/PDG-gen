import java.util.Scanner; 
 public class Main {
   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            double r = sc.nextDouble();
            double d = r*r*Math.PI;
            double f = r*2*Math.PI;
             System.out.println(String.format("%.6f",d)+" "+String.format("%.6f",f));
   }
 }
