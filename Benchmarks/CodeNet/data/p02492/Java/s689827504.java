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
        if(op.equals("?"))
        {
            System.out.println();
            return;
        }
        if(op.equals("+"))answer = x + y;
        else if(op.equals("-"))answer = x - y;
        else if(op.equals("*"))answer = x * y;
        else if(op.equals("/"))answer = x / y;
        else return;
        System.out.println(answer);

    }
}