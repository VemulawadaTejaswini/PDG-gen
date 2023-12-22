import java.util.*;

public class Main{

    Main(){
        Scanner SC = new Scanner(System.in);

        int N = Integer.parseInt(SC.next());
        int X = Integer.parseInt(SC.next());
        int Y = Integer.parseInt(SC.next());

        int[] result = new int[N];
        Arrays.fill(result,0);

        for (int i = 1; i<N; i++) {
            for (int j=i+1;j<=N;j++){
                int k = Math.min(j-i,
                        Math.min(Math.abs(X-j) + Math.abs(Y-i) +1,
                                 Math.abs(X-i) + Math.abs(Y-j) +1));
                result[k]++;
            }
        }

        for (int i = 1; i < N; i++) {
            System.out.println(result[i]);
        }


    }

    public static void main(String[] args){
        new Main();
    }
}
