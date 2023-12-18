import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  int X = sc.nextInt();
  int countp = 0;
  int countq = 0;
  for(int i = 0;i < M;i++){
    int a = sc.nextInt();
    if(X < a){
      countp++;
    }
    else if(X > a){
      countq++;
    }
  }
  System.out.println(countp >= countq ? countq:countp);
}}