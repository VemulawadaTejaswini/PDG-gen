public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i ++) { x[i] = sc.nextInt(); }
        for (int i = 0; i < n; i ++) { y[i] = sc.nextInt(); }

        double D;
        for (int i = 0; i < 4; i ++) {
            D = 0;
            if (i <= 2) {
                for (int j = 0; j < n; j ++) { D += Math.pow(Math.abs(x[j] - y[j]), i + 1); }
                if (i == 0) { System.out.println(String.format("%8.6f", D)); }
                else if (i == 1) {
                    D = Math.sqrt(D);
                    System.out.println(String.format("%8.6f", D));
                }
                else if (i == 2) {
                    D = Math.cbrt(D);
                    System.out.println(String.format("%8.6f", D));
                }
            }
        }

        double max = Double.MIN_VALUE;
        for (int i = 0; i < n; i ++) {
            if (max < Math.abs(x[i] - y[i])) { max = Math.abs(x[i] - y[i]); }
        }
        System.out.println(String.format("%8.6f", max));
    }
}