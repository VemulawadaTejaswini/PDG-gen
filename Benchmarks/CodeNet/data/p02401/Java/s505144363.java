import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        char op;
        while(true){
            a = scan.nextInt();
            op = scan.next().charAt(0);
            b = scan.nextInt();
            if(op == '?'){ break; }
            else if(op == '+'){ c = a + b; }
            else if(op == '-'){ c = a - b; }
            else if(op == '*'){ c = a * b; }
            else{ c = a / b; }
            System.out.println(c);
        }
    }
}
