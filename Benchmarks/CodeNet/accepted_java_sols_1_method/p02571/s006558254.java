import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    String T =sc.next();
    String s[] =S.split("",0);
    String t[] =T.split("",0);
    int m=S.length();
    int l =T.length();
    int ans =1000;
    int a=0;
    for(int i=0;i<=m-l;i++){
      for(int j =0;j<l;j++){
        if(s[i+j].equals(t[j])){a=a;}
        else{a =a+1;}
      }
      ans =Math.min(ans,a);
      a=0;}
    System.out.println(ans);
  }
}