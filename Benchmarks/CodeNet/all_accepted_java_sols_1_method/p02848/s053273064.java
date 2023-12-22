import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] alphas = base.split("");

        Scanner sc = new Scanner(System.in);
        int plus = sc.nextInt();
        String[] raw = sc.next().split("");
        String result = "";
        for (String c : raw) {
            int num = Arrays.binarySearch(alphas, c);
            num += plus;
            if(num > 25) num = num - 26;
            result += alphas[num];
        }
        System.out.println(result);
    }
}