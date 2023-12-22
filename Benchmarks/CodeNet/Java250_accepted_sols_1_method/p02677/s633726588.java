import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int A =sc.nextInt();
    int B =sc.nextInt();
    int H =sc.nextInt();
    int M =sc.nextInt();
    if(H>=12){H =H-12;}
    double K =Math.abs(H*30+M*0.5-M*6);
    double k =Math.cos(Math.toRadians(K));
    double T =A*A+B*B-2*A*B*k;
    double t =Math.sqrt(T);
    System.out.println(t);
  }
}