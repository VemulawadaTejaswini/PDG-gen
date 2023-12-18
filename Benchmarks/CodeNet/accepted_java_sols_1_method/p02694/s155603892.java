import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = 100;
    int count =0;
    while(y<x){
      y=y+(y/100);
      count++;
    }
    System.out.println(count);
  }
}