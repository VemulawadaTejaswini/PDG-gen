import java.util.Scanner;
public class Main
 {
    public static void main(String[] args) {
        int a, b, cal;
        String op;
        
        Scanner sc = new Scanner(System.in);
        while(true){
        a = sc.nextInt();
        op = sc.next();
        b = sc.nextInt();
        if(op.compareTo("?")==0){
        break;
        }
        else{
        if(op.compareTo("+")==0){
        cal = a + b;
        }
        else if (op.compareTo("-")==0){
        cal = a-b;
        }
        else if (op.compareTo("*")==0){
        cal = a * b;
        }
        else {
        cal = a / b;
        }
        System.out.println(cal);
        }
        }
       
    }
}
