import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int A =sc.nextInt();
    int B =sc.nextInt();
    int H =sc.nextInt();
    int M =sc.nextInt();
    if(H>=12){H =H-12;}
    double K =Math.abs(H*15+M*0.25-M*6);
    double k =Math.cos(Math.toRadians(K));
    double T =A*A+B*B-2*A*B*k;
    System.out.println(T);
  }
}