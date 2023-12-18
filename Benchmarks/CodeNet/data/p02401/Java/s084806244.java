import java.util.Scanner;
public class s2 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            String b  = sc.next();
            int c = sc.nextInt();
            int f=0;
            switch (b) {
    		case "+":
    			System.out.println(a+c);
    			break;
    		case "-":
    			System.out.println(a-c);
    			break;
    		case "*":
    			System.out.println(a*c);
    			break;
    		case "/":
    			System.out.println(a/c);
    			break;
    		default:
    			f=1;
    			break;
            }
            if(f==1)break;
            sc.close();
        }
    }
}

