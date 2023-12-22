import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String answer="";
    final String S=sc.next();
    char[] s=S.toCharArray();
    char[] sA={s[0],s[1]};
    char[] sB={s[2],s[3]};
    int a=Integer.parseInt(String.valueOf(sA));
    int b=Integer.parseInt(String.valueOf(sB));
    if(a==0&&b==0){
      answer="NA";
    }else if(a==0){
      if(b<=12){
        answer="YYMM";
      }else{
        answer="NA";
      }
    }else if(b==0){
      if(a<=12){
        answer="MMYY";
      }else{
        answer="NA";
      }
    }else if(a<=12){
      if(b<=12){
        answer="AMBIGUOUS";
      }else{
        answer="MMYY";
      }
    }else{
      if(b<=12){
        answer="YYMM";
      }else{
        answer="NA";
      }
    }
    System.out.println(answer);
  }
}