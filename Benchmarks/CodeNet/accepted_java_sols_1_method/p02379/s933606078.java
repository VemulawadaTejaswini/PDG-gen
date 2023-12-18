public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        double[] point = new double[4];
        for (int i = 0; i < 4; i ++) { point[i] = sc.nextDouble(); }
        double r = Math.sqrt((point[0] - point[2]) * (point[0] - point[2])
                             + (point[1] - point[3]) * (point[1] - point[3]));
        System.out.print(String.format("%10.8f", r));
    }
}