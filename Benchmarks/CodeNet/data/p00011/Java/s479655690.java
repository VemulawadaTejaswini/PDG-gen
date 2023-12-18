import java.util.*;

public class Main{

    public static void main(String[] args){
        int w;
        int n;
        Scanner scanner = new Scanner(System.in);
        int[] amida;

        w = scanner.nextInt();
        amida = new int[w];

        int i;
        for(i = 0; i < w; i++){
            amida[i] = i + 1;
        }

        n = scanner.nextInt();

        int a, b, c;
        String ab;
        String[] abc;
        for(i = 0; i < n; i++){
            ab = scanner.next();
            abc = ab.split(",");
            a = Integer.parseInt(abc[0]) - 1;
            b = Integer.parseInt(abc[1]) - 1;

            c = amida[a];
            amida[a] = amida[b];
            amida[b] = c;
        }

        for(i = 0; i < w; i++){
            System.out.println(amida[i]);
        }

        scanner.close();
    }
}
