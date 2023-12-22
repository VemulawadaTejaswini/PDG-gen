import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  double t = sc.nextDouble();
  double a = sc.nextDouble();
  double min = 1000000;
  int ans = 0;
  for(int i = 0;i < n;i++){
    int h = sc.nextInt();
    double tmp = Math.abs(a - (t - h*(0.006)));
    if(tmp < min){
      min = tmp;
      ans = i+1;
    }
  }
  System.out.println(ans);
}}
