import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    if((A==B)&&
      (A==C)){System.out.println("No");}
    else if((((!(A==B))&&
            (!(B==C)))&&
            (!(C==A)))){System.out.println("No");}
    else{System.out.println("Yes");}
  }
}