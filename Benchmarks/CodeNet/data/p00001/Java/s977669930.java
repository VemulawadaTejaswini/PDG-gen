import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int third = 0;
        for (int x = 0; x < 10; x++) {
            int mount = sc.nextInt();
            if ( mount >= first ) {
                third = second;
                second = first;
                first = mount;
            } else if (mount >= second) {
                third = second;
                second = mount;
            } else if (mount > third) {
                third = mount;
            }
        }
        System.out.printf("%d\n%d\n%d\n", first, second, third);
    }
}