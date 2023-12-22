import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		Deque<Integer> deque = new ArrayDeque<Integer>();

        while(sc.hasNextInt()){
        	int in = sc.nextInt();

        	if(in > 0){
        		deque.addFirst(in);
        	}else{
        		System.out.println(deque.removeFirst());
        	}
        }
    }
}