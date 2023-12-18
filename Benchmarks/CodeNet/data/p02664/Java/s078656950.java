import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String T =sc.next();
    int N =T.length();
    String t[] =T.split("",0);
    String anss ="0";
    for(int i=0;i<N;i++){
      if(t[i].equals("?")){
        t[i]=="D";}
      anss =anss +t[i];}
    String ans =anss.split(1,N+1);
    System.out.println(ans);
  }
}