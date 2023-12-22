import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a,b;
        String str = "";
        char op;
        boolean loop=true;
        Scanner sc = new Scanner(System.in);
        while(loop) {
            a = sc.nextInt();
            op = sc.next().charAt(0);
            b = sc.nextInt();
            switch (op) {
                case '+':
                    str += Integer.toString(a+b) + "\n";
                    break;
                case '-':
                    str += Integer.toString(a-b) + "\n";
                    break;
                case '*':
                    str += Integer.toString(a*b) + "\n";
                    break;
                case '/':
                    str += Integer.toString(a/b) + "\n";
                    break;
                case '?':
                    loop = false;
                    break;
            }
        }
        System.out.print(str);
    }
}