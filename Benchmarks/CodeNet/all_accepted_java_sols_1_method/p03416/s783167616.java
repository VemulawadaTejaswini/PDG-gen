import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;

        for (Integer i=A; i<=B; i++) {
            String s = i.toString();
            if (s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}

