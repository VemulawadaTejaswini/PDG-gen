import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String op = "";

        int a, b;
        while(true){
            a = scanner.nextInt();
            op = scanner.next();
            b = scanner.nextInt();
            if (op.equals("?"))break;
            if(op.equals("+"))System.out.println(a+b);
            else if(op.equals("-"))System.out.println(a-b);
            else if(op.equals("*"))System.out.println(a*b);
            else if(op.equals("/"))System.out.println(a/b);
        }
    }
}

