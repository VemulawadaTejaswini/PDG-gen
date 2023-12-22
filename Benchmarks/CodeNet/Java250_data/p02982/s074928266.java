import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args){

        int N = nextInt();
        int D = nextInt();

        int[][] a = new int[N][D];
        for(int i=0; i<N; i++){
            for(int j=0; j<D; j++){
                a[i][j] = nextInt();
            }
        }

        boolean[][] reached = new boolean[N][N];
        for(int i=0; i<N; i++){
            Arrays.fill(reached[i], false);
        }

        int count = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if (i == j || reached[i][j] || reached[j][i]) continue;
                int sum = 0;
                for (int k = 0; k < D; k++) {
                    sum += Math.pow(a[i][k] - a[j][k], 2);
                }
                reached[i][j] = true;

                int num = (int)Math.sqrt(sum);
                if(num == Math.sqrt(sum)){
                    count++;
                }
            }
        }
        println(count);
    }

    static int nextInt(){
        return Integer.parseInt(sc.next());
    }
    static void println(Object o){
        PrintWriter out = new PrintWriter(System.out);
        out.println(o);
        out.flush();
    }
   static void print(Object o){
       PrintWriter out = new PrintWriter(System.out);
       out.print(o);
       out.flush();
    }
}
