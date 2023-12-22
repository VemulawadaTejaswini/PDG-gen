import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int a = d*2+1;
    int b = n%a==0 ? n/a:n/a+1;   
    System.out.println(b);
  } 
}