import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new ArrayDeque<>();
        int i,k;

        while(true)
        {
            String input = sc.next();

            if(input.equals("-")) break;
            
            String[] binput = input.split("");

            for(i=0; i<binput.length; i++) queue.add(binput[i]);

            int m = sc.nextInt();
            int h;
            for(i=0; i<m; i++)
            {
                h = sc.nextInt();
                for(k=0; k<h; k++) queue.add(queue.poll());
            }

            //for(i=0; i<queue.length; i++) System.out.printf(queue.poll());
            for(String a : queue) System.out.printf("%s",a);
            System.out.printf("\n");
            queue.clear();
        }
        sc.close();
    }
}
