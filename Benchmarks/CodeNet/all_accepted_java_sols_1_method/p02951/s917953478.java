import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), D=A-B;
    if(C<=D) System.out.println(0);
    else System.out.println(C-D);
  }
}