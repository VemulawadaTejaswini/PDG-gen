import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;

        for (int i=0;i<n;i++){
            long input = sc.nextLong();
            if (input == 0) { result = 0; break;}

            if (result > 1000000000000000000L/input || result == -1) {
                result = -1;
            } else {
                result = result * input;
            }
        }

        System.out.println(result);
    }
}