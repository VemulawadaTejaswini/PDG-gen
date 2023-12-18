import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
      int ary[] = new int[26];
    //scan.useDelimiter("\n");
    while(scan.hasNext()){
      String str = scan.nextLine();
      for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
        if( c >= 'A' && c <= 'Z') c -= 'A';
        else if(c >= 'a' && c <= 'z') c -= 'a';
        else continue;
        ary[c]++;
      }
    }
      for(int i=0;i<26;i++){
        out.println((char)(i+'a') + " : " + ary[i]);
      }
  }
}