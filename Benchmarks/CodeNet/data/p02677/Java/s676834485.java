import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
      int A = in.nextInt();  
      int B = in.nextInt();  
      int H = in.nextInt();  
      int M = in.nextInt();  
      int x = Math.abs(30*H+M/2-6*M);
      double X = Math.cos(Math.toRadians(x));
      double C = Math.sqrt(A*A+B*B-2*A*B*X);
      System.out.println(C);
        }
    }
