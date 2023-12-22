import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "" + N;

        if (s.indexOf('7') != -1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
