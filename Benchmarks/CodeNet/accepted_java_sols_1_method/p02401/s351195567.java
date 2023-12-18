import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        String op;
        while(true){
            a = input.nextInt();
            op = input.next();
            b = input.nextInt();
            if (op.equals("?")){
                break;
            } else if (op.equals("+")){
                System.out.println(a+b);
            } else if (op.equals("-")){
                System.out.println(a-b);
            } else if (op.equals("*")){
                System.out.println(a*b);
            } else if (op.equals("/")){
                System.out.println(a/b);
            }
        }
    }
}
