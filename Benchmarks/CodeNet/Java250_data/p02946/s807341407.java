import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();

        int s = X - (K - 1);
        int e = X + (K - 1);

        for (int i = s;i <= e;i++){
            System.out.println(i);
        }
    }
}