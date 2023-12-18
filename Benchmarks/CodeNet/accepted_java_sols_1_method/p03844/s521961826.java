import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String opa = scan.next();
        int b = scan.nextInt();
        char op = opa.charAt(0);
        if(op == '+'){
            System.out.print(a + b);
        }else{
            System.out.print(a - b);
        }
    }
}