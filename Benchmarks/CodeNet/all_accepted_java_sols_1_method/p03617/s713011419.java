import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Q = scanner.nextInt(); //0.25L
        int H = scanner.nextInt(); //0.5 L
        int S = scanner.nextInt(); //1   L
        int D = scanner.nextInt(); //2   L
        int N = scanner.nextInt();
        
        double lack = N;
        long cost = 0;
        //System.err.println("2L");
        //System.err.println(2L * S + "\n" + D + "\n");
        //System.err.println(4L * H + "\n" + D + "\n");
        //System.err.println(8L * Q + "\n" + D + "\n");
        if(2L * S >= D && 4L * H >= D && 8L * Q >= D) {
            //System.err.println("2L:" + (int)(lack / 2));
            //System.err.println(lack % 2);
            cost += D * (long)(lack / 2L);
            lack = lack % 2;
        }
        //System.err.println("1L");
        //System.err.println(2L * H + "\n" + S + "\n");
        //System.err.println(4L * Q + "\n" + S + "\n");
        if(2L * H >= S && 4L * Q >= S) {
            //System.err.println("1L: " + (int)(lack / 1));
            //System.err.println(lack % 1);
            cost += S * (long)(lack / 1L);
            lack = lack % 1;
        }
        //System.err.println("0.5L");
        //System.err.println(2L * H + "\n" + H + "\n");
        if(2L * Q >= H) {
            //System.err.println("0.5L: " + (int)(lack / 0.5));
            //System.err.println(lack % 0.5);
            cost += H * (long)(lack * 2L); //lack / 0.5
            lack = lack % 0.5;
        }
        {
            //System.err.println("0.25L: " + (int)(lack / 0.25));
            //System.err.println(lack % 0.25);
            cost += Q * (long)(lack * 4L); //lack / 0.25
            lack = lack % 0.25;
        }
        assert lack == 0;
        System.out.println(cost);
    }
}