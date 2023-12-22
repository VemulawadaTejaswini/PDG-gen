import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = (b / k) * k;

        if (result >= a && result <= b){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }

    }
}