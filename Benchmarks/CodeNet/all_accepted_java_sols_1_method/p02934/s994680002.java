import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double bunsi = 0.0;
        for(int i = 0; i < N; i++){
            bunsi += 1.0 / (double)sc.nextInt();
        }
        System.out.println(1.0 / bunsi);
    }
}
