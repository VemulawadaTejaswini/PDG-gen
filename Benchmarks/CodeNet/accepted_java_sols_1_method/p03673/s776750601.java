import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            if(i%2==0) list.addLast(Integer.parseInt(sc.next()));
            else list.addFirst(Integer.parseInt(sc.next()));
        }
        boolean flg = false;
        if(n%2==0) while(!list.isEmpty()){
            if(flg)System.out.print(" ");
            System.out.print(list.poll());
            flg = true;
        }
        else while(!list.isEmpty()){
            if(flg)System.out.print(" ");
            System.out.print(list.pollLast());
            flg = true;
        }
    }
}
