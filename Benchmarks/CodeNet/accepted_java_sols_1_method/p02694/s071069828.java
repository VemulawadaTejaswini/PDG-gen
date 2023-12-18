import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long deposit = 100;
        long cnt = 0;

        while (X > deposit) {
            deposit *= 1.01;
            cnt++;
        }

        System.out.println(cnt);
    }

}



