import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        for(int i = 0; i <= X;i++){
            int j = X - i;
            if(2*i+4*j==Y){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        return;
    }
}