import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final char[] S=sc.next().toCharArray();
    boolean flg=false;
    if(S[0]==S[1]){
      if(S[1]==S[2]){
        flg=true;
      }
    }else if(S[1]==S[2]){
      if(S[2]==S[3]){
        flg=true;
      }
    }
    if(flg){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}