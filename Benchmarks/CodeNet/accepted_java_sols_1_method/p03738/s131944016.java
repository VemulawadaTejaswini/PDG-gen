import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next(),b = sc.next();
    //文字列の長さで判断（桁数で判断）
    if(a.length() > b.length()){
      System.out.println("GREATER");
    }else if(a.length() < b.length()){
      System.out.println("LESS");
    }else{//上位桁から判断
      int aa=0 ,bb=0;
      for(int i = 0;i < a.length();i++){
        aa = Integer.valueOf(a.substring(i,i+1));
        bb = Integer.valueOf(b.substring(i,i+1));
        if(!(aa == bb)){
          break;
        }
      }
      if(aa > bb){
        System.out.println("GREATER");
      }else if(aa == bb){
        System.out.println("EQUAL");
      }else{
        System.out.println("LESS");
      }
    }
  }
}
