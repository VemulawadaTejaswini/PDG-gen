import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;
        for(int i=0; i<N; i++){
            int h = scanner.nextInt();
            if(K <= h){
                count++;
            }
        }
        System.out.println(count);
    }
}