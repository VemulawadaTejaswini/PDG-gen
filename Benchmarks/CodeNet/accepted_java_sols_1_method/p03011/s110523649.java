import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        int r = scan.nextInt();
        int[] temp = {p,q,r};
        Arrays.sort(temp);
        System.out.println(temp[0] + temp[1]);
    }

}
