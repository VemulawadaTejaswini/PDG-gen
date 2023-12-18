import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        out_of_loop:
        while(true)
        {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            int ans = 0;
            switch(op)
            {
                case "+" :
                ans = a + b;
                break;
                case "-" :
                ans = a-b;
                break;
                case "*" :
                ans = a * b;
                break;
                case "/" :
                ans = a / b ;
                break;
                case "?" :
                break out_of_loop;
            }
            System.out.println(ans);
        }
        
        sc.close();

    }
}
