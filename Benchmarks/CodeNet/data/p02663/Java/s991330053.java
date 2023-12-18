import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        int H1;
        int M1;
        int H2;
        int M2;
        int K;
        try (Scanner scanner = new Scanner(System.in)) {
            H1 = scanner.nextInt();
            M1 = scanner.nextInt();
            H2 = scanner.nextInt();
            M2 = scanner.nextInt();
            K = scanner.nextInt();
        } catch (Exception e) {
            throw e;
        }

        int start = H1 * 60 + M1;
        int end = H2 * 60 + M2;
        System.out.println(end-start-K);
    }
}