import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int K = Integer.parseInt(scan.next());


        int[] treeArray = new int[N];
        for(int i =0; i < N; i++){
            treeArray[i] = Integer.parseInt(scan.next());
        }
        Arrays.sort(treeArray);


        int min = 999999999;
        int dif;
        for(int i =0; i <= N-K; i++ ){
            dif = treeArray[i+K-1] - treeArray[i];
            if(dif < min) min = dif;
        }


        System.out.println(min);
    }
}