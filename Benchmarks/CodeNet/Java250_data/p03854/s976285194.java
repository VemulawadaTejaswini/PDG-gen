import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    Map<Integer,Boolean> memo = new HashMap<>();
    String[] words = new String[]{"dream","dreamer","erase","eraser"};
    if (dp(0,s,memo,words) == true){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

  }
  public static boolean dp(int i, String s, Map<Integer,Boolean> memo, String[] words){
    if (i == s.length()){return true;}
    if (!memo.containsKey(i)){
      boolean ans = false;
      for (String word: words){
        if (s.substring(i).startsWith(word) == true){
          ans = ans || dp(i + word.length(),s,memo,words);
        }
      }
      memo.put(i,ans);
    }
    return memo.get(i);
  }
}