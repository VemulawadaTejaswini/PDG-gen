import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long x = 0;
    long y = 0;
    if(a < 0 && b < 0 && c > 0 && d > 0){
      if(a < b){
        x = b;
      }
      else{
        x = a;
      }
      if(c < d){
        y = c;
      }
      else{
        y = d;
      }
    }
    else if(a > 0 && b > 0 && c < 0 && d < 0){
      if(a < b){
        x = a;
      }
      else{
        x = b;
      }
      if(c < d){
        y = d;
      }
      else{
        y = c;
      }
    }
    else if(a <= 0 && b <= 0 && c <= 0 && d <= 0){
      if(a < b){
        x = a;
      }
      else{
        x = b;
      }
      if(c < d){
        y = c;
      }
      else{
        y = d;
      }
    }
    else if(a > 0 && b > 0 && c > 0 && d > 0){
      if(a < b){
        x = b;
      }
      else{
        x = a;
      }
      if(c < d){
        y = d;
      }
      else{
        y = c;
      }
    }
  }
}