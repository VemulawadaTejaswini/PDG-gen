import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] arr = s.toCharArray();
        int max;
        int c;
        c = max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'R') {
                c = c + 1;
            } else {
                c = 0;
            }
            if (c > max) {
                max = c;
            }
        }
        System.out.println(max);
    }
}