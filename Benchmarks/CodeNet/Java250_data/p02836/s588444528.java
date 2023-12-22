import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int c = 0;
    int l = s.length();
    for(int i=0;i<l/2;i++) {
      c+= s.charAt(i)==s.charAt(l-i-1)?0:1;
    }
    System.out.println(c);
  }
}