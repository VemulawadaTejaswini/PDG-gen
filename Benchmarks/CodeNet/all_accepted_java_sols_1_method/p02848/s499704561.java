import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int n = sc.nextInt();
    String s = sc.next();
    String ss = "";

    char abc[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    //メモ　Aが０

    for(int i = 0 ; i < s.length() ; ++i){
      for(int j = 0 ; j < abc.length ; ++j){
        if(s.charAt(i) == abc[j]){
          if(j+n>=26){
            ss += abc[j+n-26];
          }else{
            ss += abc[j+n];
            break;
          }
          
        }
      }
    }
   System.out.println(ss);
  }
}