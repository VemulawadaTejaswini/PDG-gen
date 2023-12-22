import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
      Double A = in.nextDouble();  
      Double B = in.nextDouble();  
      Double H = in.nextDouble();  
      double M = in.nextDouble();  
      double x = Math.abs(30*H+M/2-6*M);
      double X = Math.cos(Math.toRadians(x));
      double C = Math.sqrt(A*A+B*B-2*A*B*X);
      System.out.println(C);
        }
    }
