import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deq = new ArrayDeque<Integer>();
        String str = "";
        int a = 0, b = 0;
        while(sc.hasNext()){
        	str = sc.next();
        	if(str.equals("+")){
        		a = deq.pollLast();
        		b = deq.pollLast();
        		deq.addLast(a + b);
        	}else if(str.equals("-")){
        		a = deq.pollLast();
        		b = deq.pollLast();
        		deq.addLast(b - a);
        	}else if(str.equals("*")){
        		a = deq.pollLast();
        		b = deq.pollLast();
        		deq.addLast(a * b);
        	}else if(str.equals("/")){
        		a = deq.pollLast();
        		b = deq.pollLast();
        		deq.addLast(b / a);
        	}else{
        		deq.addLast(Integer.parseInt(str));
        	}
        }
        System.out.println(deq.peekLast());
    }
}
