import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, op, b, ans;
        while (true){
            ans = 0;
            a = sc.nextInt();
            op = sc.next().charAt(0);
            b = sc.nextInt();
            if (op == '+') ans = a + b;
            else if (op == '-') ans = a - b;
            else if (op == '*') ans = a * b;
            else if (op == '/') ans = a / b;
            else if (op == '?') break;
            System.out.println(ans);
        }
    }
}
