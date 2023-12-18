import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int M = sc.nextInt()*60+sc.nextInt();

        double hx = A*Math.sin(Math.toRadians(0.5 * M)), hy = A*Math.cos(Math.toRadians(0.5 * M));
        double mx = B*Math.sin(Math.toRadians(6 * M)), my = B*Math.cos(Math.toRadians(6 * M));

        System.out.println(Math.sqrt((hx-mx)*(hx-mx) + (hy-my)*(hy-my)));
    
    }
}
