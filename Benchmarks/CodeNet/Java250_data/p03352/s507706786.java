import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if(x == 1 || x == 2) {
            System.out.println(1);
        } else if(x == 1000) {
            System.out.println(1000);
        } else {
            for(int i = x; i >= 1; i--) {
                if(isPower(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }

    public static boolean isPower(int n) {
        if(n == 1) {
            return false;
        } else {
            for(int i = 2; Math.pow(n, 1.0/i) >= 2.0; i++) {
                double d = Math.pow(n, 1.0/i);
                if(d - Math.floor(d) < 0.00001)
                    return true;
            }
        }

        return false;
    }
}