import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int countMax = 0 ;

    for(int i = 1;i < S.length()  ; i ++){
      int count = 0 ;
      int[] frontChar = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      int[] backChar  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      String front = S.substring(0,i );
      String back  = S.substring(i  );
      for(int j = 0 ;j < front.length(); j++){
        if(frontChar[ (int) front.charAt(j)  - 97 ] == 0 ) {
          frontChar[ (int) front.charAt(j)  - 97 ] ++ ;
        }
      }
      for(int j = 0 ;j < back.length(); j++){
        if(backChar[ (int) back.charAt(j)  - 97 ] == 0 ) {
          backChar[ (int) back.charAt(j)  - 97 ] ++ ;
        }
      }
      for(int k = 0 ; k < 26 ; k ++){
        if(frontChar[k]  == 1 && backChar[k] == 1){
          count ++ ;
        }
      }
      if(countMax < count ){
        countMax = count ;
      }
    }

    System.out.println( countMax );
  }
}
