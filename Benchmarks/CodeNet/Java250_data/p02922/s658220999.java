import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int tap = 1;
    int atap = 0;
    
    while(tap < b){
      tap--;
      tap += a;
      atap++;
    }
    
    System.out.println(atap);
    
    
  }
}