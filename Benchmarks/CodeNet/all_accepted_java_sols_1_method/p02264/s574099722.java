import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Deque<String> name = new ArrayDeque<>();
        Deque<Integer> time = new ArrayDeque<>();
        int totalTime = 0;
        for(int i = 0; i < n; i++){
            name.add(sc.next());
            int tmp = sc.nextInt();
            time.add(tmp);
            totalTime += tmp;
        }
        int sumTime = 0;
        Deque<String> finishName = new ArrayDeque<>();
        Deque<Integer> finishTime = new ArrayDeque<>();
        while(sumTime != totalTime){
            int t = time.poll();
            if(t <= q){
                sumTime += t;
                finishTime.add(sumTime);
                finishName.add(name.poll());
            }else{
                sumTime += q;
                time.add(t - q);
                name.add(name.poll());
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(finishName.poll() + " " + finishTime.poll());
        }
    }
}
