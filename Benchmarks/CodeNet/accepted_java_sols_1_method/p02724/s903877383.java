import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        //スキャン
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        
        int five = H / 500 * 1000;
        int zan = H % 500;
        int litFic = zan /5 * 5;
        System.out.println(five + litFic);
    }
}