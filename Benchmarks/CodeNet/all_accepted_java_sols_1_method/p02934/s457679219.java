import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double sum = 0.0;
        for(int i=0; i<N; i++){
            int A = scanner.nextInt();
            sum += 1.0/A;
        }
        System.out.println(1.0/sum);
    }
}