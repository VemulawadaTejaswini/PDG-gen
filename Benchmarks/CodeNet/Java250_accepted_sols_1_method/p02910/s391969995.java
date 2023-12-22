import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    final String s=new Scanner(System.in).next();
    final char[] S=s.toCharArray();
    boolean flg=false;
    for(int i=0;i<s.length();i++){
      if(i%2==1){
        if(S[i]!='L'){
          if(S[i]!='U'){
            if(S[i]!='D'){
              flg=true;
            }
          }
        }
      }else{
        if(S[i]!='R'){
          if(S[i]!='U'){
            if(S[i]!='D'){
              flg=true;
            }
          }
        }
      }
    }
    if(flg){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}