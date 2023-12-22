import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    sc.close();
    long now =100;
    int c = 0;
    // Stirng i = 9223372036854775807
    // System.out.println(1); 
    while(N>now){
      now = now + now/100;
      // now = now + (int)(now*0.01);
      c++;
      // System.out.println(c);  
    }
    System.out.println(c);  
  }
  
}


