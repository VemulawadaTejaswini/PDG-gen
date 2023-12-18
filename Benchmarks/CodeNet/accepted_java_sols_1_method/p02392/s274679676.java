import java.util.*;

class Main {
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();    
      b = sc.nextInt();    
      c = sc.nextInt(); 
      if (a>b) {
        System.out.println("No");
      } else if (a>c) {
        System.out.println("No");
      } else if (b>c) {
        System.out.println("No");
      } else if (a==b) {
        System.out.println("No");
      } else if (b==c) {
        System.out.println("No");
      } else if (c==a) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      } 
    }
}
