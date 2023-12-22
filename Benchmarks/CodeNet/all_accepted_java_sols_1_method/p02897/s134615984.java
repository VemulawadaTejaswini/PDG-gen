import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double n;
    n=sc.nextInt();
    double k;
    if(n%2==0){
      k=n/2;
    }else{
      k=n/2+0.5;
    }
    double d;
    d=k/n;
    System.out.printf("%.10f",k/n);
  }
}
