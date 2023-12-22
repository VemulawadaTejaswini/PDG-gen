import java.util.*;
class Main{
  public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();   
    int a = sc.nextInt();
    int t = 0;
    while(h > 0){
    h = h - a;
      t = t + 1;
      }
    System.out.println(t);
 }
}