import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] req = sc.nextLine().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = req.length; i > 0; i--) {
            sb.append(req[i - 1]);
        }
        System.out.println(sb.toString());
    }
}