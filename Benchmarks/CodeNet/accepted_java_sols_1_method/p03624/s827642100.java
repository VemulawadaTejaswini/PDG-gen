import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    int[] num = new int[26];
    for(int i = 0 ;i < S.length() ; i ++){
      num[ ( (int) S.charAt(i) )- 97 ] ++ ;
    }
    boolean notFoundFlag = true;
    for(int i = 0 ; i< num.length ; i++){
      if( num[i] == 0 ){
        System.out.println( (char) (i + 97) );
        notFoundFlag = false;
        break;
      }
    }
    if(notFoundFlag){
      System.out.println("None");
    }
  }
}
