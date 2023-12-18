import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
                    
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            
            int answer = 0;
            
            if(op.equals("?")){
                break;
            }
            
            switch(op){
                case "+":
                    answer = a+b;
                    break;
                case "-":
                    answer = a-b;
                    break;
                case "*":
                    answer = a*b;
                    break;
                case "/":
                    answer = a/b;
                    break;
            }
            
            System.out.println(answer);
        }
    }
}
