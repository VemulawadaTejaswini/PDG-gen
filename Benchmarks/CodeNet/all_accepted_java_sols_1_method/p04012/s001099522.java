import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    char[] a = {'a', 'b', 'c','d','e','f', 'g', 'h', 'i', 'j', 'k', 'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int[] check = new int[26];
    int out =0;
    for (int j =0; j<26; j++) {
      for (int i =0; i< w.length(); i++) {
        if (w.charAt(i) == a[j]){
          check[j]++;
        }
      }
    }
    for (int i=0 ; i<26; i++) {
      if(check[i] % 2 != 0){
        out++;
      }
    }
    if (out != 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}