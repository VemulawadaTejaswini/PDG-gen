import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            long x = sc.nextLong();
            String op = sc.next();
            long y = sc.nextLong();
            long answer = 0;

            if(op.equals("?")) return;
            if(op.equals("+"))answer = x + y;
            else if(op.equals("-"))answer = x - y;
            else if(op.equals("*"))answer = x * y;
            else if(op.equals("/"))answer = x / y;
            else return;
            System.out.println(answer);
        }
        catch(Exception e){
            return;
        }

    }
}