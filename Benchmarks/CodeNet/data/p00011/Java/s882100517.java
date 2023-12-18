import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int w = stdIn.nextInt();
        int n = stdIn.nextInt();
        int[] values = new int[w];
        for(int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
        for(int i = 0; i < n; i++) {
            String str = stdIn.next();
            String[] ab = str.split(",");
            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;

            int work = values[a];
            values[a] = values[b];
            values[b] = work;
        }
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        stdIn.close();
    }
}
