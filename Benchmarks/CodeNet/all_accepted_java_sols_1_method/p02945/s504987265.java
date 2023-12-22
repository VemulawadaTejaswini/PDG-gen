import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int A=scan.nextInt();
    int B=scan.nextInt();
    int max=A*B;
    if(max<A+B){
      max=A+B;
    }
    if(max<A-B){
      max=A-B;
    }
    System.out.println(max);
  }
}