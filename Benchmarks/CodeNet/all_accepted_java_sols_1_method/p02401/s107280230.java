import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int ans = 0;
        String op = "";

        Scanner sc= new Scanner(System.in);

        while( true ) {
        	a = sc.nextInt();
        	op = sc.next();
        	b = sc.nextInt();

        	if( op.equals( "?" ) ) {
        		break;
        	}

        	switch( op ) {
        	case "+":
        		ans = a + b;
        		break;
        	case "-":
        		ans = a - b;
        		break;
        	case "*":
        		ans = a * b;
        		break;
        	case "/":
        		ans = a / b;
        		break;
        	}
        System.out.println( ans);
        }
    sc.close();
    }
}
