import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int A = stdIn.nextInt();
    String op = stdIn.next();
    int B = stdIn.nextInt();
    if(op.contains("+")){
      System.out.println(A+B);
    }else{
      System.out.println(A-B);
    }
  }
}