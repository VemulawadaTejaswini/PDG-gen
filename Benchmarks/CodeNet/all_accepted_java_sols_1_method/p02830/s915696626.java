import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int N =sc.nextInt();
String S = sc.next();
String T = sc.next();
char[] s = S.toCharArray();
char[] t = T.toCharArray();
String a = "";
for(int i=0;i<N;i++){
a += "" +s[i] + "" + t[i] + "";
}
System.out.println(a);
  }
}