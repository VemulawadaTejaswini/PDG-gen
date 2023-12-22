import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] C = new int[4];

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            switch (s) {
                case "AC":
                    C[0] = C[0] + 1;
                    break;
                case "WA":
                    C[1] = C[1] + 1;
                    break;
                case "TLE":
                    C[2] = C[2] + 1;
                    break;
                default:
                    C[3] = C[3] + 1;
                    break;
            }
        }

        System.out.println("AC x " + C[0]);
        System.out.println("WA x " + C[1]);
        System.out.println("TLE x " + C[2]);
        System.out.println("RE x " + C[3]);
    }
}