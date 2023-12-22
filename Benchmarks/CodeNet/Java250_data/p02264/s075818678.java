import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        String name[] = new String[n];
        int time[] = new int[n];
        for(int i = 0; i < n; i++){
            name[i] = sc.next();
            time[i] = sc.nextInt();
            queue.add(i);
        }
        
        int x = 0;
        while(!queue.isEmpty()){
            int y = queue.poll();
            if(time[y] <= q){
                x += time[y];
                System.out.println(name[y]+" "+x);
            }else{
                x += q;
                time[y] -= q;
                queue.add(y);
            }
        }
    }
}
