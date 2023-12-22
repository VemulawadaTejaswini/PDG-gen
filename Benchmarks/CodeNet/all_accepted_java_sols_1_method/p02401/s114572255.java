import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1,num2;
        String op;
        while(true){
            num1 = sc.nextInt();
            op = sc.next();
            num2 = sc.nextInt();

            if(op.equals("?"))   break;

            switch(op){
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
            }
        }
    }
}
