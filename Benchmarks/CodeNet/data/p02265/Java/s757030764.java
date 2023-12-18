import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            String command = sc.next();
            if(command.equals("insert"))
                dq.addFirst(sc.nextInt());
            else if(command.equals("delete"))
                dq.remove(sc.nextInt());
            else if(command.equals("deleteFirst"))
                dq.remove();
            else
                dq.removeLast();
        }
        int size = dq.size();
        for(int i = 0 ; i < size-1 ; i++)
            sb.append(dq.removeFirst() + " ");
        System.out.println(sb.append(dq.removeFirst()));
    }
}
