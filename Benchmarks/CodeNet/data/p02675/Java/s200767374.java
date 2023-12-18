import java.util.*;
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int hon = N % 10;
        if (hon == 3) {
            System.out.println("bon");
        } else if (hon == 2 || hon == 4 || hon == 5 || hon == 7 || hon == 9 ){
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}