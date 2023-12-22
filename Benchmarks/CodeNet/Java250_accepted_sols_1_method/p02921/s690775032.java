import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=0;
    String S=sc.next();
    String T=sc.next();
    String tenS[]=S.split("");
    String tenT[]=T.split("");

    for(int i=0;i<3;i++){
      if(tenS[i].equals(tenT[i])){
        n++;
      }
    }

     System.out.println(n);

  }
}
