import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        int tmp = a;
        a = b;
        b = tmp;

        tmp = a;
        a = c;
        c = tmp;

        int answer[] = {a, b, c};

        for(int i : answer) {
            System.out.println(i);
        }
        sc.close();
    }
}
