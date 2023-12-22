import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int lock = N;
        for(int i =0; i<2;i++){
        lock *= N;
        }
        
        System.out.println(lock);
    }
}
