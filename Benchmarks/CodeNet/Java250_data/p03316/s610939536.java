import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 値の取得
        String target = sc.nextLine();
        String[] arr;
        arr = target.split("");

        int sum = 0;

        for (String item : arr) {
        	sum += Integer.parseInt(item);
        }

        if (Integer.parseInt(target) % sum == 0) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }

    }
}