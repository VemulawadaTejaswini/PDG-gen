import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //命令数
        ArrayDeque<Integer> list = new ArrayDeque<Integer>();
        //命令の読み込み
        for(int i=0; i<n; i++) {
            String com = sc.next();
            switch(com) {
                case "insert": list.push(Integer.parseInt(sc.next())); break;
                case "delete": list.remove(Integer.parseInt(sc.next())); break;
                case "deleteFirst": list.removeFirst(); break;
                case "deleteLast": list.removeLast(); break;
            }
        }
        int a = list.getFirst();
        int b = list.size()-1;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<b; i++) {
            sb.append(list.poll());
            sb.append(" ");
        }
        if(list.size()!=0) {
            System.out.print(sb);
            System.out.println(list.poll());
        } else {
            System.out.println(a);
        }
    }
}

