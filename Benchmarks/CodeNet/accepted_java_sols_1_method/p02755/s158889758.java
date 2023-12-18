import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int D =4*B-5*A;
    if((D>=5)||(D<=-4)){System.out.println(-1);}
    else{if(D>=0){System.out.println(10*B);}
    else{ int C=A%2;
         System.out.println((25*A+C)/2);}
        }
  }
}
