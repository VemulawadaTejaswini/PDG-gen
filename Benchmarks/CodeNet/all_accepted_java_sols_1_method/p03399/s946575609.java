import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    if(A <= B){
      if(C <= D){
        System.out.println(A + C);
      }else{
        System.out.println(A + D);
      }
    }else{
      if(C <= D){
        System.out.println(B + C);
      }else{
        System.out.println(B + D);
      }
    }

  }
}
