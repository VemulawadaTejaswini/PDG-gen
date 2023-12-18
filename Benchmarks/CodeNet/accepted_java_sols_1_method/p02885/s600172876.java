import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 入力受付
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a < b * 2){
            System.out.println(0);
        }else{
            System.out.println(a - b * 2);
        }

    }

}