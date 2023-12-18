import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = 0;
  int d = 0;
  int e = 0;
  for(int i = 0;i < n;i++){
    int p = sc.nextInt();
    if(p <= a)c++;
    else if(p <= b)d++;
    else e++;
  }
  if(c<=d && c<=e)System.out.println(c);
  else System.out.println(d <= e ? d:e);
}}