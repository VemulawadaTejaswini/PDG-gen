import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int A = stdIn.nextInt();
    int B = stdIn.nextInt();
    int w =A+B;
    if(A%3==0||B%3==0||w%3==0){
      System.out.println("Possible");
    }else{
      System.out.println("Impossible");
    }
  }
}