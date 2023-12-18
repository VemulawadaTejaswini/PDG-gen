import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int timenow = 0;
        int n = sc.nextInt();
        int q = sc.nextInt();
        String[] names = new String[n];
        int[] times = new int[n];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; i++){
            names[i] = sc.next();
            times[i] = sc.nextInt();
            queue.add(i);
        }
        while (queue.size()!=0){
            int p = queue.poll();
            if (times[p]>q) {
                times[p] -= q;
                queue.add(p);
                timenow += q;
            } else {
                timenow += times[p];
                System.out.println(names[p]+" "+timenow);
            }
        }
    }
}