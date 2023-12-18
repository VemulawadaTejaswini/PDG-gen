import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        int m = H*60+M;

        double distance = Math.sqrt((A*Math.cos(m*Math.PI/30)-B*Math.cos(m*Math.PI/360))*(A*Math.cos(m*Math.PI/30)-B*Math.cos(m*Math.PI/360))
                +(A*Math.sin(m*Math.PI/30)-B*Math.sin(m*Math.PI/360))*(A*Math.sin(m*Math.PI/30)-B*Math.sin(m*Math.PI/360)));

        System.out.println(distance);
    }
}
