import java.util.*;
import java.math.*;
class Main{
public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  String s = stdIn.next();
  char[] a = new char[s.length()];
  int counta = 0;
  int countb = 0;
  char b = ' ';
  char c = ' ';
  int k = 0;
  for(int i = 0;i<a.length;i++) {
    a[i] = s.charAt(i);
  }
  b = a[0];
  for(int i = 0;i<a.length;i++) {
    if(b==a[i]) counta += 1;
    else if(k==0){
      k += 1;
      c = a[i];
      countb += 1;
    } else if(k!=0&&c==a[i]) {
      countb += 1;
    }
  }
  if(counta==countb&&counta==2&&countb==2) {
    System.out.println("Yes");
  } else {
    System.out.println("No");
  }

}
}
