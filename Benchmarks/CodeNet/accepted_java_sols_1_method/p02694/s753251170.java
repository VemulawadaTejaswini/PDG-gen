import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong();
    long m = 100;
    int ans = 0;
    
    while(m<x){
      m = (long)(m*1.01);
      ans++;
    }
    System.out.println(ans); 
  }
}