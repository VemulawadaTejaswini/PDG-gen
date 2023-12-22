import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int result;
        if(k % 2 == 0){
            result = (k / 2) * (k / 2);
        } else {
            result = (k / 2) * (k / 2 + 1);
        }
        System.out.println(result);
    }
}
