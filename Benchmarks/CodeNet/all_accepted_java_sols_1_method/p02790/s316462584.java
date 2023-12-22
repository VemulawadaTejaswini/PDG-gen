import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<max; i++) {
            sb.append(min);
        }
        System.out.println(sb.toString());
    }
}
