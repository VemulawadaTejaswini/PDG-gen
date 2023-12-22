import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alicePoints = 0;
        int bobPoints = 0;
        int n = Integer.parseInt(sc.nextLine());
        String[] a = sc.nextLine().split(" ");

        Integer[] aInt = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            aInt[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(aInt, Comparator.reverseOrder());
        for (int tursCount = 0; tursCount < n; tursCount++) {
            if (tursCount % 2 == 0) {
                alicePoints = alicePoints + aInt[tursCount];
            } else {
                bobPoints = bobPoints + aInt[tursCount];
            }
        }
        System.out.println(alicePoints - bobPoints);
    }
}