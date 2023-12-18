import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<ArrayDeque<Integer>> queue = new ArrayList<>();
        for(int i = 0;i < n;i++){
            queue.add(new ArrayDeque<>());
        }

        for(int i = 0;i < q;i++){
            int num = sc.nextInt();
            int t = sc.nextInt();

            switch(num){
                case 0: //enqueue
                    int x = sc.nextInt();
                    queue.get(t).add(x);
                    break;
                case 1: //front
                    if(queue.get(t).size() > 0)
                        System.out.println(queue.get(t).getFirst());
                    break;
                case 2: //dequeue
                    if(queue.get(t).size() > 0)
                        queue.get(t).remove();
                    break;
            }
        }
    }
}
