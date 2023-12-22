import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder bd = new StringBuilder();
        ArrayList<String> A = new ArrayList<String>();
        //int[] A = new int[26];
        //Arrays.fill(A, 0);
        //String str;
        int t = 0;
        int h = 0;

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            String taro = sc.next();
            String hanako = sc.next();

            if (taro.compareTo(hanako) > 0) t += 3;
            else if (taro.compareTo(hanako) < 0) h += 3;
            else {t += 1; h += 1;}
        }
        System.out.print(t);
        System.out.print(" ");
        System.out.println(h);

    }
}
