import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    String s=sc.next();

    if (k>1) {
      if (s.charAt(k-1)=='A') {
        String str1=s.substring(0,k-1);
        String str2="a";
        String str3=s.substring(k);
        System.out.println(str1+str2+str3);
      }
      if (s.charAt(k-1)=='B') {
        String str1=s.substring(0,k-1);
        String str2="b";
        String str3=s.substring(k);
        System.out.println(str1+str2+str3);
      }
      if (s.charAt(k-1)=='C') {
        String str1=s.substring(0,k-1);
        String str2="c";
        String str3=s.substring(k);
        System.out.println(str1+str2+str3);
      }
      // System.out.println(str1+str2+str3);
    }else{
      if (s.charAt(k-1)=='A') {
        String str1="a";
        String str2=s.substring(1);
        System.out.println(str1+str2);
      }
      if (s.charAt(k-1)=='B') {
        String str1="b";
        String str2=s.substring(1);
        System.out.println(str1+str2);
      }
      if (s.charAt(k-1)=='C') {
        String str1="c";
        String str2=s.substring(1);
        System.out.println(str1+str2);
      }
      // System.out.println(str1+str2);
    }
  }
}
