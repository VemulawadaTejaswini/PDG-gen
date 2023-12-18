import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int dim = Integer.parseInt(sc.nextLine());
      
      //declare vectors
      double[] x = new double[dim];
      double[] y = new double[dim];
      
      //initialize x
      String[] input = sc.nextLine().split(" ");
      for(int i = 0; i < dim; i ++) {
         x[i] = Integer.parseInt(input[i]);
      }
      
      //initialize y
      input = sc.nextLine().split(" ");
      for(int i = 0; i < dim; i ++) {
         y[i] = Integer.parseInt(input[i]);
      }
      
      printDistance(1.0, x, y);
      printDistance(2.0, x, y);
      printDistance(3.0, x, y);
      printChebyshev(x, y);
      
   }
   
   public static void printDistance(double p, double[] x, double[] y) {
      double distance = 0;
      int dim = x.length;
      
      for(int i = 0; i < dim; i ++) {
         double temp = Math.abs(x[i] - y[i]);
         temp = Math.pow(temp, p);
         distance += temp;
      }
      distance = Math.pow(distance, 1.0 / p);
      
      System.out.println(distance);
   }
   
   public static void printChebyshev(double[] x, double[] y) {
      double max = Math.abs(x[0] - y[0]);
      int dim = x.length;
      
      for(int i = 1; i < dim; i ++) {
         double temp = Math.abs(x[i] - y[i]);
         if (temp > max) {
            max = temp;
         }
      }
      
      System.out.println(max);
   }
   
}
