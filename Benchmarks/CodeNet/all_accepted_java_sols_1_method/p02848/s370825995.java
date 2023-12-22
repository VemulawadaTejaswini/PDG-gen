import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String x = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char[] c = new char[26];
    for(int i=0; i<26; i++){
      c[i] = x.charAt(i);
    }
    for(int i=0; i<s.length(); i++){
      char y = s.charAt(i);
      int z = 0;
      for(int j=1; j<26; j++){
        if(c[j]==y){
          z = j;
        }
      }
      System.out.print(c[(n+z)%26]);
    }
  }
}