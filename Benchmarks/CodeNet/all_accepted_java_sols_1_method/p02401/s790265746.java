import java.util.Scanner;
import java.lang.Math;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    int ans=0;
    String str;
    char op;

    while(true){
      a = sc.nextInt();
      str = sc.next();
      op = str.charAt(0);
      b = sc.nextInt();

      if (op == '+') {
        ans = a+b;
        System.out.println(ans);
      }
      else if (op == '-'){
        ans = a-b;
        System.out.println(ans);
      }
      else if (op == '*'){
        ans = a*b;
        System.out.println(ans);
      }
      else if (op == '/'){
        ans = a/b;
        System.out.println(ans);
      }
      else if (op == '?') {
        //System.out.printf("\n");
        break;
      }
    }
  }

}

