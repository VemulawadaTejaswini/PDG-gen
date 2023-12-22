import java.util.*;
import java.math.BigDecimal;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int L=sc.nextInt();
    if(L==1){System.out.println(0.0370370);}
    else if(L==2){System.out.println(0.0740740);}else{
    int M=L*L*L;
    double m=M/27;
    String X = BigDecimal.valueOf(m).toPlainString();
    System.out.println(X);}
  }
}
