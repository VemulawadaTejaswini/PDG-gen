import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double d = sc.nextDouble();
    int count =0;
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      double f = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
      if(f<=d){
        count++;
      }
    }
    System.out.println(count);
  }
}