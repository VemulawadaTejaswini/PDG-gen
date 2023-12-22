import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int Y = sc.nextInt();
  int x = -1; int y = -1; int z = -1;
  out:
  for(int i = 0;i <= N;i++){
    for(int j = 0;j <= N-i;j++){
      for(int k = 0;k <= N-i-j;k++){
        if(10000*i + 5000*j + 1000*k == Y && i+j+k == N){
          x = i;y = j;z = k;
          break out;
        }
      }
    }
  }
  System.out.println(x+" "+y+" "+z);
}}
