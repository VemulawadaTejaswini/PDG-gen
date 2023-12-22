import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int a,b,d;
    a = sc.nextInt();
    int x[] = new int [a];
    d = 0;
    for(b =0;b < a;b++){
      x[b] = sc.nextInt();
      d = d + x[b];
    }
    int e = c-d;
    if(e >= 0){
      System.out.println(e);
    }else{
      System.out.println("-1");
    }
  }
}