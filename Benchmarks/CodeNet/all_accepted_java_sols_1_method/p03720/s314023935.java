import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  int[] a = new int[2*M];
  for(int i = 0;i < 2*M;i++){
    a[i] = sc.nextInt();
  }
  for(int i = 0;i < N;i++){
    int ans = 0;
    for(int j = 0;j < 2*M;j++){
      if(a[j] == i+1)ans++;
    }
    System.out.println(ans);
  }
}}
