import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        while (op!='?'){
            if (op=='+'){
                System.out.println(a+b);
            } else if (op=='-'){
                System.out.println(a-b);
            } else if (op=='*'){
                System.out.println(a*b);
            } else if (op=='/'){
                System.out.println(a/b);
            }
            a = sc.nextInt();
            op = sc.next().charAt(0);
            b = sc.nextInt();
        }
    }
}

