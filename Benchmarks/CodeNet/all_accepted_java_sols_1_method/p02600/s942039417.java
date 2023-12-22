import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        if (n >= 1800) {
            count = 1;
        } else if (n >= 1600) {
            count = 2;
        } else if (n >= 1400) {
            count = 3;
        } else if (n >= 1200) {
            count = 4;
        } else if (n >= 1000) {
            count = 5;
        } else if (n >= 800) {
            count = 6;
        } else if (n >= 600) {
            count = 7;
        } else {
            count = 8;
        }
        System.out.println(count);
    }
}
