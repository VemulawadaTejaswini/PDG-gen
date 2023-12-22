import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str1 = sc.nextLine();
    int len = str1.length();
    int counta = 0;
    int countb = 0;
    for(int i= 0; i < len; i++) {
      if(counta > 0 && countb > 0) 
            break;
      if(str1.charAt(i) == 'A') {
        counta += 1;
      }
      else {
        countb += 1;
      }
    }
    System.out.println((counta > 0 && countb > 0) ? "Yes" : "No");
  }
}
