import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();
        long result = 0;
        for(int i = 1; i <= N; i++) {
            if(i % 3 != 0 && i % 5 != 0)  result += i;
        }
        System.out.println(result);
    }
}
