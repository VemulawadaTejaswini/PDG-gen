import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String w =sc.next();

    String alphabets = "abcdefghijklmnopqrstuvwxyz";
    int[] count = new int[26];

    for(int i = 0 ; i < w.length(); i ++){
      count[ alphabets.indexOf( w.charAt(i) ) ] ++ ;
    }

    boolean isBeautiful = true;
    for(int j = 0 ;j < 26 ; j++){
      if( count[j] % 2 != 0 ){
        isBeautiful = false;
        break;
      }
    }
    System.out.println( isBeautiful ? "Yes" : "No" );
  }
}
