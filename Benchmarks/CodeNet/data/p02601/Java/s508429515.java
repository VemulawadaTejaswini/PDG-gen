import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = Integer.parseInt(sn.next());
        int b = Integer.parseInt(sn.next());
        int c = Integer.parseInt(sn.next());
        int x = Integer.parseInt(sn.next());

        for ( int i = 0; i < x; i++){
            if (a >= b){
                b = b *2;
            }else if (b >= c){
                c = c *2;
            }
        }

        if (a < b && b <c){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}