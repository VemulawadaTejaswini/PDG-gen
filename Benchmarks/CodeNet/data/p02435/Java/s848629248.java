import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Map<Integer,Deque<Long>> Stack = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            Deque<Long> L = new ArrayDeque<>();
            Stack.put(i,L);
        }
        for(int i=0;i<q;i++){
            int cmd = sc.nextInt();
            int t = sc.nextInt();
            if(cmd==0) Stack.get(t).push(sc.nextLong());
            else if(cmd==1 && Stack.get(t).size()!=0) sb.append(Stack.get(t).getFirst()+"\n");
            else if(cmd==2 && Stack.get(t).size()!=0) Stack.get(t).pop();
        }
        System.out.print(sb);
    }
}
