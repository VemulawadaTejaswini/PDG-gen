import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1000; ; i += 1000) {
            if(i >= n) {
                n = i - n;
                break;
            }
        }
        System.out.println(n);
    }
}
