import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String argv[]) {
        Scanner cin = new Scanner(System.in);
        final int MX = 170*80;
        int h = cin.nextInt();
        int w = cin.nextInt();
        int[][] a = new int[h][w];
        int[][] b = new int[h][w];
        Boolean[][][] c = new Boolean[h][w][MX];
        Consumer<BiConsumer<Integer,Integer>> loop = f ->
            IntStream.range(0, h).forEach(i ->
                IntStream.range(0, w).forEach(j -> f.accept(i,j)) );
        loop.accept((i,j)-> Arrays.fill(c[i][j], false));
        loop.accept((i,j)-> a[i][j] = cin.nextInt());
        loop.accept((i,j)-> b[i][j] = cin.nextInt());
        loop.accept((i,j)-> {
            int d = Math.abs(a[i][j]-b[i][j]);
            IntStream.range(0, MX).forEach(k->{
                if (i>0 && c[i-1][j][k] 
                        || j>0 && c[i][j-1][k] 
                        || i==0 && j==0 && k==0) {
                    c[i][j][k+d] = c[i][j][Math.abs(k-d)] = true;
                    // System.err.println("a("+k+"): " + i +" "+ j + " " + (k+d));
                    // System.err.println("s("+k+"): " + i +" "+ j + " " + Math.abs(k-d));
                }
            });
        });
        long answer = Arrays.asList(c[h-1][w-1]).indexOf(true);
        System.out.println(answer);
    }
}
