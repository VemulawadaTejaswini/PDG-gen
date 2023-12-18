import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;

        for (int i=0;i<n;i++){
            long input = sc.nextLong();
            result = result * input;
            if (result > 1000000000000000000L || result < 0) {
                result = -1;
            } else if (input == 0 ){
                result = 0;
                break;
            }
        }

        System.out.println(result);
    }
}