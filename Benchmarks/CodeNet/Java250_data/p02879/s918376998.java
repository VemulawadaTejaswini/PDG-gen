import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System .in);
        Integer a = scan.nextInt();
        Integer b = scan.nextInt();

        if(a <= 9 && b <= 9){
            System.out.println(a*b);
        }
        else {
            System.out.println(-1);
        }
        scan.close();
    }
}