import java.util.Scanner;

public class TestingAtcoder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        var x = scan.nextInt();
        if (0<= x || x >=1){
            if (x==0){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
