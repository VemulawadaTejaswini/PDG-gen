import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        while(true){
            int x = sc.nextInt();
            String a = sc.next();
            int y = sc.nextInt();
            int z = 0;

            if(a.equals("+")) z = x + y;
            if(a.equals("-")) z = x - y;
            if(a.equals("*")) z = x * y;
            if(a.equals("/")) z = x / y;
            if(a.equals("?")) break;

            System.out.printf("%d\n",z);
        }    
    } 
}
