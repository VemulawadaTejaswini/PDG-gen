import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    long x = sc.nextLong();
    long count = 0;
    long num = 100;

    while(num<x){
      count++;
      num = num + (long)((double)num * 0.01);
    }

    System.out.println(count);
  }
}