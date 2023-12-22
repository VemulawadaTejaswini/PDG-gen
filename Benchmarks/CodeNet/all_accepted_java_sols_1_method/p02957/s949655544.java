import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int A =sc.nextInt();
    int B =A+sc.nextInt();
    if(B%2==1){System.out.println("IMPOSSIBLE");}
    else{System.out.println(B/2);}
  }
}