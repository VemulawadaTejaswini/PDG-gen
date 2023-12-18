import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ni = (int) (n / 1.08);

        if (((int)(ni * 1.08)) == n ) {
            System.out.println(ni);
        } else if(((int) ((ni + 1) * 1.08)) == n) {
            System.out.println(ni+1);
        } else {
            System.out.println(":(");
        }

    }
}

