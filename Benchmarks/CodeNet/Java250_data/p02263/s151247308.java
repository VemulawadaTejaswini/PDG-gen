
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> deque=new ArrayDeque<>();
        int count=0;
        while(scanner.hasNext()){
            String input=scanner.next();
            //count++;
            //System.out.println(String.format("%d:%s",count,input));
            if(input.charAt(0)=='*'){
                int x=deque.removeFirst();
                int y=deque.removeFirst();
                deque.addFirst(x*y);
            }else if(input.charAt(0)=='+'){
                int x=deque.removeFirst();
                int y=deque.removeFirst();
                deque.addFirst(x+y);

            }else if(input.charAt(0)=='-'){
                int x=deque.removeFirst();
                int y=deque.removeFirst();
                deque.addFirst(y-x);

            }else{
                int i=Integer.parseInt(input);
                deque.addFirst(i);
            }
        }
        //System.out.println(deque);
        System.out.println(deque.removeFirst());
    }
}

