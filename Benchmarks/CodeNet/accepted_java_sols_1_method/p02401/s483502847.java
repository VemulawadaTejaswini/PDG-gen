import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        outside: while (true) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            char op = inputs[1].charAt(0);
            int b = Integer.parseInt(inputs[2]);

            switch (op) {
                case '+':
                System.out.println(a+b);
                break;
                case '-':
                System.out.println(a-b);
                break;
                case '*':
                System.out.println(a*b);
                break;
                case '/':
                System.out.println(a/b);
                break;
                case '?':
                break outside;
            }
        }
    }
}