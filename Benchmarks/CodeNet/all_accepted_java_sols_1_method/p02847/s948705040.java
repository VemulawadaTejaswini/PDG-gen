import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String P =sc.next();
    String M[] ={"SAT","FRI","THU","WED","TUE","MON","SUN"};
    for(int i=0;i<7;i++){
      if(P.equals(M[i])){System.out.println(i+1);}
    }
  }
}