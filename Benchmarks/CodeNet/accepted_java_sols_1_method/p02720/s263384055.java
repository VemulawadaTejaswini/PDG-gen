
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int K = sc.nextInt();
        Queue<Long> queue = new ArrayDeque<>();
        for(long i=1;i<10;i++){
            queue.add(i);
        }
        long x = 0;
        for(int i=0;i<K;i++){
            x = queue.poll();
            if(x % 10 != 0){
                queue.add(x * 10 + x % 10 - 1);
            }
            queue.add(x * 10 + x % 10);
            if(x % 10 != 9){
                queue.add(x * 10 + x % 10 + 1);
            }
        }
        System.out.println(x);
    }
}
