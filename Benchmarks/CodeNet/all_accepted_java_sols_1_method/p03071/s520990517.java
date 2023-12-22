import java.util.*;

class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;

        if (A > B) {
            sum += A;
            A -= 1;
        } else {
            sum += B;
            B -= 1;
        }

        if (A > B) {
            sum += A;
        } else {
            sum += B;
        }

        System.out.println(sum);
    }
}
