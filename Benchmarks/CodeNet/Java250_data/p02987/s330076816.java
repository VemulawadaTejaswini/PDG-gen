import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String S1 = S.substring(0,1);
    String S2 = S.substring(1,2);
    String S3 = S.substring(2,3);
    String S4 = S.substring(3,4);
    if (S1.equals(S2) && S3.equals(S4) && !(S1.equals(S3))){
      System.out.println("Yes");
    }else if(S1.equals(S3) && S2.equals(S4) && !(S1.equals(S2))){
      System.out.println("Yes");
    }else if(S1.equals(S4) && S2.equals(S3) && !(S1.equals(S2))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}