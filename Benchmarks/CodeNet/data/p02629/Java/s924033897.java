import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    String[] a = new String[]{"z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String b = "";
    while (n>0){
      int t = (int) n%26;
      b = a[t]+b;
      if (t == 0){
        t = 26;
      }
      n -= t;
      n = (long) n/26;
    }
    System.out.println(b);
  }
}
