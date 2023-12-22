import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S= sc.next();

    String result = "";
    for(int i = 0 ; i <  S.length();  i ++){
      switch( S.charAt(i)  ){
        case '0':
          result = result + "0";
        break;
        case '1':
          result = result + "1";
        break;
        case 'B':
          if(!result.isEmpty()){
            result = result.substring(0,result.length() - 1);
          }
        break;
      }
    }
    System.out.println(result);
  }
}
