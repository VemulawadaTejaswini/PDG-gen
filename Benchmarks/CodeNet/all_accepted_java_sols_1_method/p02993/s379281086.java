import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final String S=sc.next();
    char[] s=S.toCharArray();
    boolean flg=false;
    for(int i=0;i<3;i++){
      if(s[i]==s[i+1]){
        flg=true;
        break;
      }
    }
    if(flg){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }
  }
}