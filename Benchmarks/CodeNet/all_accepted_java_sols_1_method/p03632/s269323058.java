import java.io.*;
import java.util.*;



class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    //c<<b<<d
    if(c <= b && b <= d){
      System.out.println( Math.min(Math.abs(a-b), Math.abs(c-b)) );
    }
    //c<<a<<d
    else if(c <= a && a <= d){
      System.out.println( Math.min(Math.abs(a-b), Math.abs(a-d)) );
    }
    //a<<c<<d<<b
    else if(a < c && d < b){
      System.out.println( Math.abs(d-c) );
    }else{
      System.out.println(0);
    }
  }
}
