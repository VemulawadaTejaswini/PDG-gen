import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int max = Math.max(a,Math.max(b,c));
    int total = a+b+c-max;
    for(int i = 0;i<k;i++){
      max*=2;
    }
    System.out.println(total + max);
  }
}
