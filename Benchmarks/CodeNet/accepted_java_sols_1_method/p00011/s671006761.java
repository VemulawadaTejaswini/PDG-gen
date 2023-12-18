import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] m = new int[w];
        int a;
        int b;
        int temp;
        String c;

        for(int i = 0; i < w; i++){
            m[i] = i + 1;
        }

        for(int i = 0; i < n; i++){
            c = sc.next();
            String[] num = c.split(",", 0);
            a = Integer.parseInt(num[0]);
            b = Integer.parseInt(num[1]);

            temp = m[a - 1];
            m[a - 1] = m[b - 1];
            m[b - 1] = temp;
        }

        for(int i = 0; i < w; i++){
            System.out.println(m[i]);
        }

        sc.close();
    }
}
