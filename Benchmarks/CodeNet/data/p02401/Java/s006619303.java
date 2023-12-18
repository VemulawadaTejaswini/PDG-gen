import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        while(true){
            int a = in.nextInt();
            char op = in.next().charAt(0);
            int b = in.nextInt(), res=0;

            if(op == '?')break;

            switch (op){
                case '+':
                    res = a + b;
                    break;
                
                case '-':
                    res = a - b;
                    break;

                case '*':
                    res = a * b;
                    break;

                case '/':
                    res = a / b;
                    break;
            }

            System.out.println(res);
        }
    }
}
