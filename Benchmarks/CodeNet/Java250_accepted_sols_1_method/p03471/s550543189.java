import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m3 = 0;
    int m1b = 0;
    int m2b = 0;
    int m3b = 0;    
    for(int m1 = 0;m1 <= a;m1++){
      for(int m2 = 0;m2 <= a-m1;m2++){
        m3 = a - m1 - m2;
        m1b = m1 * 10000;
        m2b = m2 * 5000;
        m3b = m3 * 1000;  
        if(m1b + m2b + m3b == b){
         System.out.println(m1 + " " + m2 + " " + m3); 
          System.exit(0);
        }
      }
    }
    System.out.println(-1 + " " + -1 + " " + -1);
  }
}