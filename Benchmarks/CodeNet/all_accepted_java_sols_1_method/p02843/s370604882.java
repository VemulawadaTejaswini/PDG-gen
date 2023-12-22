import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = n / 105;
        int high = n / 100;
        for(int i = low; i <= high; i++){
            int tmp = n;
            tmp -= (i*100);
            if(0 <= tmp && tmp <= 5*i){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
