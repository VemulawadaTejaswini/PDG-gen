import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        List<Integer> factors = primeFactor(N);

        int count =0;
        for (int pow : factors){
            int increase=1;
            while(pow-increase>=0){
                pow -= increase;
                increase++;
                count++;
            }
        }


        System.out.println(count);
    }

    static List<Integer> primeFactor(long N){

        List<Integer> res = new ArrayList<>();

        for (int i = 2; i*i <=N ; i++) {
            int count =0;
            while(N%i==0){
                N /= i;
                count++;
            }
            if(count!=0)
            res.add(count);
        }
        if(N!=1){
            res.add(1);
        }
        return res;
   }


}
