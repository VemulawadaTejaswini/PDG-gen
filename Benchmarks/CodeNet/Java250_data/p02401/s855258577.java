import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;

        end: {
            while(true) {
                int a = sc.nextInt();
                String op = sc.next();
                int b = sc.nextInt();

                switch (op) {
                    case "+": ans = a+b; break;
                    case "-": ans = a-b; break;
                    case "*": ans = a*b; break;
                    case "/": ans = a/b; break;
                    case "?": break end;
                }

                System.out.println(ans);
            }
        }
    }
}