import java.util.*;

class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = Integer.parseInt(sc.next());
  int b = Integer.parseInt(sc.next());
  int c = Integer.parseInt(sc.next());
  sc.close();

  if (a<b) {
   if (b<c) {
    System.out.println("Yes");
    return;
   }
  }
  System.out.println("No");
 }
}
