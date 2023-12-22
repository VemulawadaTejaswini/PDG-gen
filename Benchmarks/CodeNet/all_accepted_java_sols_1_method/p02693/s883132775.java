import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String result = "NG";
        for (int i = A; i <= B; i++) {
            if(i%K == 0){
                result = "OK";
            }
        }
        System.out.println(result);
    }
}