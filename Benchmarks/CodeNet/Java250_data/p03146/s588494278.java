import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] a = new int[1000000];
  Arrays.fill(a,0);
  a[n]=1;
  int cnt = 1;
  for(;;){
    if(n%2==0){
      n /= 2;
    }
    else{
      n = n*3 + 1;
    }
    if(a[n] == 1){
      break;
    }
    else{
      a[n] = 1;
      cnt++;
    }
  }
  System.out.println(cnt+1);
}}
      
