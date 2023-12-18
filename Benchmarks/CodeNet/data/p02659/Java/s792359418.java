import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    double b = sc.nextDouble();
    
    long num = (long)(a*(int)(Math.round(b*100)/100));
    System.out.print(num);
  }
}