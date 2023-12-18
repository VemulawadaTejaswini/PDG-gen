import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] in = input.split(" ");
        
        int M = Integer.parseInt(in[0]);
        int D = Integer.parseInt(in[1]);
        
        int count = 0;
        for (int i = 1; i <= M; i++ ) {
            for (int j = 10; j <= D; j++) {
                String a = String.valueOf(j).substring(0,1);
                String b = String.valueOf(j).substring(1);
                int A = Integer.parseInt(a);
                int B = Integer.parseInt(b);
                if (A < 2 || B < 2) {
                    continue;
                }
                if (A * B == i) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
