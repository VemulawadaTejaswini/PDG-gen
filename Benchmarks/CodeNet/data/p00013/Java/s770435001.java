import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Deque<Integer> q = new ArrayDeque<>();
        while(in.hasNextLine()){
            int a = in.nextInt();
            if(a == 0){
                System.out.println(q.pop());
            }else{
                q.push(a);
            }
        }
    }
}