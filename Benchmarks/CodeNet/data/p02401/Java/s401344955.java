import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        while(true){
        int a = scan.nextInt();
        String op = scan.next();
        int b = scan.nextInt();
        
        if(op.equals("?"))break;
        
        int ans = 0;
        
            switch(op){
            case "*":
                ans = a * b;
                break;
                
            case "/":
                ans = a / b;
            break;
            
            case "+":
                ans = a + b;
                break;
                
            case "-":
              ans = a - b;
                break;
        }
          System.out.println(ans);
        }
        
    }
}
