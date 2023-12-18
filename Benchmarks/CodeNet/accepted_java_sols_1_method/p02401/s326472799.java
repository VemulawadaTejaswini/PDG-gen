import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        String mOperator=scan.next();
        int y=scan.nextInt();
        
        while(!(mOperator.equals("?"))){
            switch(mOperator){
                case "+":
                    System.out.println(x+y);
                break;
                case "-":
                    System.out.println(x-y);
                break;
                case "*":
                    System.out.println(x*y);
                break;
                case "/":
                    System.out.println(x/y);
                break;
            }
        x=scan.nextInt();
        mOperator=scan.next();
        y=scan.nextInt();
        }
    }
}
