import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(sum < n){
            sum += 1000;
        }
        System.out.println(sum- n);

    }
}
