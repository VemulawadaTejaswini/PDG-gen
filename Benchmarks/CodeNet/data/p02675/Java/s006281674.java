import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();

        int x = n % 10;
        switch (x) {
            case 3:
                System.out.println("bon");
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                System.out.println("pon");
                break;
            default:
                System.out.println("hon");
                break;
        }
    }
}
