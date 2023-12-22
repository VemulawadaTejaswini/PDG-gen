import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] cnt = new int[26];

    while(sc.hasNextLine()){
      String s = sc.nextLine();

      for(int i = 0; i < s.length(); i++){
        if('a' <= s.toLowerCase().charAt(i) && s.toLowerCase().charAt(i) <= 'z'){
          cnt[s.toLowerCase().charAt(i) - 'a'] += 1;
        }
      }
    }

    for(int i = 0; i < 26; i++){
        System.out.println((char)('a' + i) + " : " + cnt[i]);
    }
  }
}

