import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    String[] a = new String[]{"z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    while (n>0){
      long t1 = (long) n%26;
      int t = (int) t1;
      System.out.print(a[t]);
      if (t == 0){
        t = 26;
      }
      n -= t;
      n = (long) n/26;
    }
    System.out.println("");
  }
}
