import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        String ans = "";

        if(Math.abs(c-a) <= d) {
            ans = "Yes";
        } else if(Math.abs(b-a) <= d && Math.abs(c-b) <= d) {
            ans = "Yes";
        } else {
            ans = "No";
        }

        System.out.println(ans);
    }
}