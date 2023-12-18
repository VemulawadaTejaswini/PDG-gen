import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();

        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(sc.nextInt());
        }

        long t = 0;
        int ans = 0;
        while(t < k){
            int r;
            if(!a.isEmpty() && !b.isEmpty()){
                if(a.peek() <= b.peek()){
                    r = a.poll();
                }else{
                    r = b.poll();
                }
            }else if(!a.isEmpty()){
                r = a.poll();
            }else if(!b.isEmpty()){
                r = b.poll();
            }else{
                System.out.println(ans);
                return;
            }
            if(r + t <= k){
                ans++;
                t += r;
            }
        }

        System.out.println(ans);
    }
}
