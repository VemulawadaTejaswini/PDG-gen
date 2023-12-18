import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int n;
        try (Scanner sc = new Scanner(System.in)){
            while(sc.hasNextInt()){
                n = sc.nextInt();
                if (n==0){
                    System.out.println(stack.pop());
                }else{
                    stack.push(n);
                }
            }
        }
    }
}
