import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        boolean isOdd = true;
        String ret = "Yes";
        for (char c : s.toCharArray()) {
            if (isOdd && c == 'L' || !isOdd && c == 'R') {
                ret = "No";
                break;
            }
            isOdd = !isOdd;
        }
        System.out.println(ret);
    }
}
