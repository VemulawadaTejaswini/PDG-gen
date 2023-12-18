import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] now = new double[2];
        double sumangle = 0.0;
        while(true) {
            String line = sc.nextLine();
            String[] linesp = line.split(",");
            int walk = Integer.parseInt(linesp[0]);//歩数
            int angle = Integer.parseInt(linesp[1]);//整数
            if(walk == 0 && angle == 0) {
                System.out.println((int)now[0]);
                System.out.println((int)now[1]);
                break;
            }
            now[1] += (double)walk * Math.cos(Math.toRadians(sumangle));
            now[0] += (double)walk * Math.sin(Math.toRadians(sumangle));
        sumangle += (double)angle;
        }
    }
}
