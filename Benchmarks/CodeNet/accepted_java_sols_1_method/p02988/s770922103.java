import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int count = 0;
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 1; i < a - 1; i++) {
            if (b[i] > b[i - 1] && b[i] < b[i + 1]) {
                count++;
            } else if (b[i] < b[i - 1] && b[i] > b[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
