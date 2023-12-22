import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        long price = 0;
        long price1 = 0;
        long price2 = 0;
        if(X<=Y){
            price1 = 2*C*X + B*(Y-X);
            price2 = 2*C*Y;
            price = Math.min(price1,price2);
        }else{
            price1 = 2*C*Y + A*(X-Y);
            price2 = 2*C*X;
            price = Math.min(price1,price2);
        }
        
        if(A*X+B*Y>=price){
            System.out.println(price);
        }else{
            System.out.println(A*X+B*Y);
        }
        
    }
}
