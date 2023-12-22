import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = sc.nextInt();
        long Ans = 1;
        for (int i =0 ; i < N; i++){
            long a = sc.nextLong();
            if(a ==0 ){
                System.out.println(0);
                return;
            }
            Ans = Ans * a;
        }
        long b = (long)Math.pow(10 , 18);
        if(Ans > b || Ans == 0){
            System.out.println(-1);
        }else{
            System.out.println(Ans);
        }
    }
}
