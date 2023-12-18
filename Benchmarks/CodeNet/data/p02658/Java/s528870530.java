import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long Ans = 1;
        for (int i =0 ; i < N; i++){
            long a = sc.nextLong();
            Ans = Ans * a;
        }
        sc.close();
        if(Ans > (long)Math.pow(10 , 18)){
            System.out.println(-1);
        }else{
            System.out.println(Ans);
        }
    }
}
