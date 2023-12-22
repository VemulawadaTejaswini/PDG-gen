import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int A =sc.nextInt();
    int B =sc.nextInt()-1;
    int C =B/(A-1);
    int D;
    if(B%(A-1)==0){D=C;}else{D=C+1;}
    System.out.println(D);
  }
}