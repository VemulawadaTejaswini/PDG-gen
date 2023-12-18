import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in1 = 0, in2 = 0;
        double x = 0 , y = 0, rad = 0;
        while(s.hasNext()){
            s.useDelimiter(",");
            in1 = s.nextInt();
            s.useDelimiter("\\r\\n");
            in2 = s.nextInt();
            rad = in2/180 * Math.PI;
            x += in1 * Math.sin(rad);
            y += in1 * Math.cos(rad);
        }
        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));
    }
}