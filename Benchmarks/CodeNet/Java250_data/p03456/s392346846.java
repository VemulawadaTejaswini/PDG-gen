import java.util.*;

class Main {
public static void main(String[] args) {
 Scanner stdIn = new Scanner(System.in);
  String a = stdIn.next();
  String b = stdIn.next();
  String ab = a + b;
  int c = Integer.parseInt(ab);
  int i = 1;
  
  for(i = 1; i < c; i++) {
    if(i * i == c) break;
  }
  if(i != c) System.out.println("Yes");
  else System.out.println("No");
}
}