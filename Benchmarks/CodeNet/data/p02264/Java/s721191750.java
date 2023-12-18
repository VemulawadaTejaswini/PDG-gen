import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<String> name_queue = new ArrayDeque<>();
        Queue<Integer> queue = new ArrayDeque<>();
        int n = sc.nextInt();
        int q = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            name_queue.add(sc.next());
            queue.add(sc.nextInt());
        }
        int count_time = 0;
        while(true){
            String name = name_queue.poll();
            if(queue.peek() == null)
                break;
            int num = queue.poll();
            if(num <= q){
                count_time += num;
                System.out.println(name + " " + count_time);
            }
            else{
                count_time += q;
                num -= q;
                queue.add(num);
                name_queue.add(name);
            }
        }
    }
}
