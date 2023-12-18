import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a == 1) {
            System.out.println("YES");
            System.exit(0);
        }

        int tmpA = a;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<b; i++) {
            list.add(tmpA%b);
            tmpA += a;
        }

        if(list.contains(c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
