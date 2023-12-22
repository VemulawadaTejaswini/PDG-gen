import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String r = sc.next();
  char[] a = r.toCharArray();
  String s = sc.next();
  long n = Long.parseLong(s);
  boolean b = true;
  char c = 'a';
  out:
  for(int i = 0;i < r.length();i++){
    c = a[i];
    if(c != '1'){
      if(n < i+1){
        break out;
      }
      else{
      b = false;
      break out;
      }
    }
  }
  System.out.println(b? "1":c);
}
}
      