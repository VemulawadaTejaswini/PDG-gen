import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final int N  = scanner.nextInt();
        final ArrayList<Integer> A = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<N; i++){
            int a = scanner.nextInt();
            int count = 0;
            while(a%2==0){
                a=a/2;
                count++;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}