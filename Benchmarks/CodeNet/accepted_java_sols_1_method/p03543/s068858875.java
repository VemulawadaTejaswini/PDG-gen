public class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int S = sc.nextInt();
        int flag = 0;
        char[] A = new char[4];
        for (int i = 0; i < 4; i++) {
            A[i] = (char)('0' + (S % 10));
            S /= 10;
        }
        for (int i = 0; i < 2; i++) {
            flag = 0;
            for (int j = 0; j < 2; j++) {
                if (A[j+i] != A[j+1+i]) flag = 1;
            }
            if (flag == 0) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}