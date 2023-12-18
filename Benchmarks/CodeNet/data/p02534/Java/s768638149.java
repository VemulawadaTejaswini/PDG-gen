import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        String sum = "";
        for(int i = 0; i<K; i++){
            sum += "ACL";
        }
        System.out.println(sum);
    }
}
