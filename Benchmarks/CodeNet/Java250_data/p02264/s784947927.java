import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int n = sc.nextInt();
        int q = sc.nextInt();
        Queue<Integer> task = new ArrayDeque<>();
        String[] name = new String[n];
        int[] time = new int[n];
        for(int i = 0; i < n; i++) {
            name[i] = sc.next();
            time[i] = sc.nextInt();
            task.add(i);
        }
 
        sc.close();
 
        int t = 0;
        while(!task.isEmpty()) {
            int i = task.poll();
            if(time[i] <= q) {
                t += time[i];
                System.out.printf("%s %d\n", name[i], t);
            }else {
                t += q;
                time[i] -= q;
                task.add(i);
            }
        }
    }
}
