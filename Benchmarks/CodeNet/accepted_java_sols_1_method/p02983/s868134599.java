import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        long L = sc.nextLong();
        long R = sc.nextLong();
        
        long tmp = L / 2019;
        if(tmp > 0){
            L = L - (2019 * tmp);
            R = R - (2019 * tmp);
        }

        long min = Integer.MAX_VALUE;
        if(R - L < 2019){
            for(long i = L; i < R; i++){
                for(long j = i+1; j <= R; j++){
                    min = Math.min(min,(i * j) % 2019);
                }
            }
        }else{
            min = 0;
        }
        System.out.println(min);
    }
}
