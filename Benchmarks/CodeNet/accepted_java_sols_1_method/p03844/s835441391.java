import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int B = Integer.parseInt(S[2]);
    String op = S[1];
    int ans = 0;
    if(op.equals("+")){
      ans = A + B;
    }else{
      ans = A - B;
    }
    System.out.println(ans);
  }
}