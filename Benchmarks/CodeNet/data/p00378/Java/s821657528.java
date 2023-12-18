
import java.util.*;

class Main
{

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int X = scan.nextInt();
        int n;
        int o;
        int t;
        int g;
        int z;
        int y;


        n = X / 1000;
	
        if (X % 1000 == 0) {
            o = A * n;
        } else {
            o = A * (n + 1);
        }


        t = X / 500;

        if (X % 500 == 0) {
            g = B * t;

        } else {
            g = B * (t + 1);         
        }


        int mini = 99999999;
        int nedan;

        for (int i = 0; i < 1000; i++) {
            if (X >= i * 1000) {
                z = X - (i * 1000);

                y = z / 500;
                if (z % 500 == 0) {
                    nedan = i * A + y * B;
                }else{
                    nedan = i * A + (y + 1) * B;
                }
                if (mini >= nedan) {
                    mini = nedan;
                }
            }
        }
        if (0 < g && o < mini) {
            System.out.println(o);

        } else if (g < o && g < mini) {

            System.out.println(g);

        } else if (mini <= o && mini <= g) {
            System.out.println(mini);
            
        }
    }
}

