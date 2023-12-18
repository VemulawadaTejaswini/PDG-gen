import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            double[][] data = new double[2][2];
            for(int k = 0; k < data.length; k++){
                double x0 = sc.nextDouble();
                double y0 = sc.nextDouble();
                data[k][0] = sc.nextDouble() - x0;
                data[k][1] = sc.nextDouble() - y0;
            }
            data[0][1] *= data[1][0];
            data[1][1] *= data[0][0];
            String s = (data[0][1] == data[1][1]) ?
                    "YES" : "NO" ;
            System.out.println(s);
        }
        sc.close();
    }
}