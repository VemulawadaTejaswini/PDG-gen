import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    String SS[] =S.split("",0);
    int N =SS.length;
    long ans =0;
    int t;
    for(int i=0;i<N;i++){
      t=Integer.parseInt(SS[i]);
      ans =ans+t;
      ans =ans%9;}
    if(ans ==0){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}