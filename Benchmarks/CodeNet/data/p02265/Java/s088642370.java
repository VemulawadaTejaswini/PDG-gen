import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        
        Deque<Integer> list = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            String cmd = sc.next();
            switch(cmd) {
                case "insert":
                list.addFirst(sc.nextInt());
                break;
                case "delete":
                list.remove((Integer)sc.nextInt());
                break;
                case "deleteFirst":
                list.removeFirst();
                break;
                case "deleteLast":
                list.removeLast();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(true) {
            sb.append(list.removeFirst());
            if(!list.isEmpty()) {
                sb.append(" ");
            }else {
                break;
            }
        }
        System.out.println(sb);
        
        sc.close();
    }
}
