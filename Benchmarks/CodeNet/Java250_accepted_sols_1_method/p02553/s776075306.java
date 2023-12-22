import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        sc.close();
        long ansList[] = {a*c, a*d, b*c, b*d};
        long max = ansList[0];
        for(int i=0; i<ansList.length; i++) {
            if (max<ansList[i]) {
                max=ansList[i];
            }
        }
        System.out.println(max);
    }
}
