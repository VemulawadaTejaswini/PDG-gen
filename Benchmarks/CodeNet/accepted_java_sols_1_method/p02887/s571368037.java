import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String s = sc.next();
  char[] c = s.toCharArray();
  int ans = 0;
  for(int i = 1;i<n;i++){
    if(c[i]!=c[i-1]){
      ans++;
    }
  }
  System.out.println(ans+1);
}}