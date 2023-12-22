import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double power2 = Math.pow(a, 2);
    double power3 = Math.pow(a, 3);
    int sum = a + (int)power2 + (int)power3;
    System.out.println(sum);
  }
}