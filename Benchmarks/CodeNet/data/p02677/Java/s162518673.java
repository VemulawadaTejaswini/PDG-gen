import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int m = scan.nextInt();

        int mAngle =  m * 120;
        int hAngle =  h * 60 + m;

        double diffAngle = Math.abs(mAngle - hAngle) < 360 ? Math.abs(mAngle - hAngle) : 720 - Math.abs(mAngle - hAngle);

        double length = a * a + b * b - (2*a*b*Math.cos(diffAngle * Math.PI / 360));

        System.out.println(Math.sqrt(length));

        scan.close();
    }
}