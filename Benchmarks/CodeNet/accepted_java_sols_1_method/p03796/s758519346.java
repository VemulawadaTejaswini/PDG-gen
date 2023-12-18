import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N =sc.nextInt();
  double p = 1.0;
  for(int i = 0;i < N;i++){
    p *= i+1;
    p %= Math.pow(10,9)+7;
  }
  System.out.println((int)p);
}}
