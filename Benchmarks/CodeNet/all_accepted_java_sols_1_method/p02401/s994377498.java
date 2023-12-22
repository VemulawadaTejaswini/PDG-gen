import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a, b, ans=0;
        String op="";
        Scanner s = new Scanner(System.in);
        do{
            a = s.nextInt();
            op = s.next();
            b = s.nextInt();
            if (op.equals("?")) break;
            if (op.equals("+")) ans=a+b;
            else if (op.equals("-")) ans=a-b;
            else if (op.equals("*")) ans=a*b;
            else if (op.equals("/")) ans=a/b;
            System.out.println(ans);
        } while (true);
    }
}
