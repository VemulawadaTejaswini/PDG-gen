import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int a, b, ans = 0;
    String op;
    Scanner in = new Scanner(System.in);

    while(true){
        a = in.nextInt();
        op = in.next();
        b = in.nextInt();

        if("?".equals(op)){
            return;
        }else if("+".equals(op)){
            ans = a + b;
            System.out.println(ans);
        }else if("-".equals(op)){
            ans = a - b;
            System.out.println(ans);
        }else if("*".equals(op)){
            ans = a * b;
            System.out.println(ans);
        }else if("/".equals(op)){
            ans = a / b;
            System.out.println(ans);
        }
    }

    
  }
}