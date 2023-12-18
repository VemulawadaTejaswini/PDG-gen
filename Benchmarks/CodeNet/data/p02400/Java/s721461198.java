import java.util.Scanner;
class Main{   
 public void yatary() {  
      Scanner sc = new Scanner(System.in); 
     int r;
     double f;
     double men;
     double syu;
     r = sc.nextInt();
     f = 3.141592653589;
     men = r *1.0 * r * 1.0 * f;
     syu = r * 1.0 * 2 * f;
     System.out.printf("%2.7f %2.7f",men,syu);
     }
public static void main(String[] args){ 
    new Main().yatary();    
}
} 