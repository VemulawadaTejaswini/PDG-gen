import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            String op = sc.next();
            int y = sc.nextInt();
            if(op.equals("+")) System.out.printf("%d\n", x+y);
            else if(op.equals("-")) System.out.printf("%d\n", x-y);
            else if(op.equals("*")) System.out.printf("%d\n", x*y);
            else if(op.equals("/")) System.out.printf("%d\n", x/y);
            else break;
        }
    }
}

