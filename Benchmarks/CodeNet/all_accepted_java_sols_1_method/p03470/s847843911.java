import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int mochi_num = Integer.parseInt(scanner.nextLine());
        
        for(int i = 0; i < mochi_num; i++)
        {
            int mochi_size = Integer.parseInt(scanner.nextLine());
            if(!stack.contains(mochi_size))
            {
                stack.offer(mochi_size);
            }
        }
        
        System.out.println(stack.size());
    }
}