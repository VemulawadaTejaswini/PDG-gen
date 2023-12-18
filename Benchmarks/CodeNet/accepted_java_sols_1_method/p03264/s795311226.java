import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        int numEven = k / 2;
        int numOdd = (k + 1) / 2;

        int ans = numEven * numOdd;

        System.out.println(ans);
    }

}
