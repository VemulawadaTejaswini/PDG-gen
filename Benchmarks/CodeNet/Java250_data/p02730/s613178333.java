import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    String s1 = next();
    String[] ss1 = splitString(s1);

    int n = s1.length();

    String s2 = "";
    String s3 = "";

    for(int i=0;i<(n-1)/2;i++){
      s2 += ss1[i];
    }

    for(int i=(n+3)/2-1;i<n;i++){
      s3 += ss1[i];
    }

    String[] ss2 = splitString(s2);
    String[] ss3 = splitString(s3);

    boolean ok = true;

    for(int i=0;i<s1.length();i++){
      if(!ss1[i].equals(ss1[s1.length()-1-i])){
        ok = false;
        break;
      }
    }

    for(int i=0;i<s2.length();i++){
      if(!ss2[i].equals(ss2[s2.length()-1-i])){
        ok = false;
        break;
      }
    }

    for(int i=0;i<s3.length();i++){
      if(!ss3[i].equals(ss3[s3.length()-1-i])){
        ok = false;
        break;
      }
    }

    if(ok){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }

  }

  static int lcm(int a,int b){
    return a*b*gcd(a,b);
  }

  static int gcd(int a,int b){
    if(a%b!=0){
      return gcd(b,a%b);
    }
    else{
      return b;
    }
  }

  /*
    static String toSmall(String s){
      char c = s.charAt(0);
      //if(Character.isUpperCase(c)){
      if(c<=90){
        c += 32;
      }
      return String.valueOf(c);
    }
    static String toBig(String s){
      char c = s.charAt(0);
      //if(Character.isLowerCase(c)){
      if(c>=97){
        c -= 32;
      }
      return String.valueOf(c);
    }
  */

  static String toSmall(String s){
    return s.toLowerCase();
  }

  static String toBig(String s){
    return s.toUpperCase();
  }

  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
  }

  static char[] splitChar(String s){
    return s.toCharArray();
  }

  static int charToInt(char a){
    return a - 48;
  }

////////////////////////////////////////////
  public static int max(int[] a){
    int lng = a.length;
    int max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
  public static long max(long[] a){
    int lng = a.length;
    long max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
////////////////////////////////////////////

////////////////////////////////////////////
  public static int min(int[] a){
    int lng = a.length;
    int min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
  public static long min(long[] a){
    int lng = a.length;
    long min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
////////////////////////////////////////////

}
