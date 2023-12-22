import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
            queue.add(a[i]);
        }
        sc.close();
        int price = 0;
        while(!queue.isEmpty() && m > 0){
            price = queue.poll();
            price/=2;
            if(price!=0){
                queue.add(price);
            }
            m--;
        }
        long res = 0;
        while(!queue.isEmpty()){
            res+=queue.poll();
        }

        System.out.println(res);
    }
    
}