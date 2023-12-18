import java.util.Scanner;
import java.util.Vector;

class Main{

  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextLine()){
      int dif = 0;
      StringBuffer line =  new StringBuffer(sc.nextLine());
      String[] words = line.toString().split(" ");
      for ( String word : words ){
        if ( word.length() == 3 || word.length() == 4 ){
          for ( int i = 0; i < 26; i++ ){
            char[] carr = word.toCharArray();
            for ( int j=0; j<carr.length; j++){
              carr[j] += i;
              if ( 'z' <= carr[j] ){
                carr[j] += ('a'-'z');
              }else{
                carr[j]++;
              }
            }
            String str = new String(carr);
            if ( str.equals("the") || str.equals("this") || str.equals("that") ){
              dif = i;
              break;
            }
          }
        }
      }
      System.out.println(dif);

      for ( int i = 0; i < line.length(); ++i){
        char c = line.charAt(i);
        if ( 'a' <= c && c <= 'z' ){
          c += dif;
          if ( 'z' <= c ){
            c += ('a'-'z'); 
          }else{
            c ++;
          }
        }
        line.setCharAt(i,c );
      }
      System.out.println( line );
    }
  }
}