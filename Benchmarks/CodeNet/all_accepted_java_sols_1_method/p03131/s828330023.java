import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  long k = sc.nextLong();
  long a = sc.nextLong();
  long b = sc.nextLong();
  long ans = 0;
  if(b - a <= 2){
    ans = k + 1;
  }
  else{
    if((k - a + 1)%2 == 0){
    ans = (long)((k-a+1)/2) * (b-a) + a;
    }
    else{
      ans = (long)((k-a+1)/2) * (b-a) + a  + 1;
    }
  }
  System.out.println(ans);
}}
  