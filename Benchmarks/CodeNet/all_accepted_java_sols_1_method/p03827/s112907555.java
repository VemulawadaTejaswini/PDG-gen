import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  String s = sc.next();
  int x = 0;
  int max = 0;
  for(int i = 0;i < N;i++){
    if(s.charAt(i) == 'I'){
      x++;
      max = Math.max(max,x);
    }
    else x--;
  }
  System.out.println(max);
}}