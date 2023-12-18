import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String op = sc.next();
        int y = sc.nextInt();
        int answer = 0;
        if(op == null)return;
        if(op.equals("?")) return;
        if(op.equals("+"))answer = x + y;
        if(op.equals("-"))answer = x - y;
        if(op.equals("*"))answer = x * y;
        if(op.equals("/"))answer = x / y;
        System.out.println(answer);
    }
}