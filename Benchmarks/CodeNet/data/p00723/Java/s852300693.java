import java.io.*;
import java.util.*;

class Main{
  public static Scanner cin;
  public static HashSet<String> m;

  public static String reverse(String s){
    return new StringBuilder(s).reverse().toString();
  }

  public static void main(String []args){
    cin=new Scanner(System.in);
    int j=0,n=cin.nextInt();
    cin.nextLine();
    for(;j<n;j++){
    String s=cin.nextLine();
    m=new HashSet<String>();
    int j=1;
    for(;i<s.length();i++){
      String s1=s.substring(0,i),s2=s.substring(i),r1=reverse(s1),r2=reverse(s2);
      m.add(s1+s2);
      m.add(r1+s2);
      m.add(s1+r2);
      m.add(r1+r2);
      m.add(s2+s1);
      m.add(r2+s1);
      m.add(s2+r1);
      m.add(r2+r1);
    }
    System.out.println(m.size());
    }
  }
}