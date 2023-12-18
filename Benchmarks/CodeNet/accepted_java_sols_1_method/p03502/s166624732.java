import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fx = 0;
        int tmp = N;
        
        while(tmp != 0){
            fx += tmp % 10;
            tmp /= 10;
        }
        System.out.println(N % fx == 0 ? "Yes" : "No");
    }   
}
