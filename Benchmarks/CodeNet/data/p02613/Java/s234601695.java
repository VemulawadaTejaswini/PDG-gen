import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N+1];
        for (int i = 0; i < N+1; i++) {
            S[i] = sc.nextLine();
        }
        int C0 = 0;
        int C1 = 0;
        int C2 = 0;
        int C3 = 0;
        int ER = 0;
        for (int i = 0; i < N+1; i++) {
            if ( S[i].equals("AC")) {
                C0 = C0 + 1;
            } else if ( S[i].equals("WA")) {
                C1 = C1 + 1;
            } else if ( S[i].equals("TLE")) {
                C2 = C2 + 1;
            } else if (S[i].equals("RE")){
                C3 = C3 + 1;
            } else {
                ER = 0;
            }
        }
        System.out.println("AC X" + " " + C0);
        System.out.println("WA X" + " " + C1);
        System.out.println("TLE X" + " " + C2);
        System.out.println("RE X" + " " + C3);
    }
}