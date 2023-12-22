import java.util.Scanner;
class Main{  
    public void yatary() { 
    Scanner sc = new Scanner(System.in);
        double r,f,men,syu;
          r = sc.nextDouble();
          f = 3.141592653589;
          men = r *1.0 * r * 1.0 * f;
          syu = r * 1.0 * 2 * f;
          System.out.printf("%2.6f %2.6f",men,syu);
    }
    public static void main(String[] args){ 
    new Main().yatary();   
   }
} 