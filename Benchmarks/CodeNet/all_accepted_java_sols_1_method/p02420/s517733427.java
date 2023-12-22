import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		String b;
		while(!(b=s.next()).equals("-")){
			char buf[]=b.toCharArray();
			ArrayDeque<Character> deque=new ArrayDeque<>();
			for(char c:buf)
				deque.add(c);
			for(int i=s.nextInt(); i>0; i--){
				for(int j=s.nextInt(); j>0; j--){
					deque.add(deque.poll());
				}
			}
			for(int i=0; i<buf.length; i++)
				buf[i]=deque.poll();
			System.out.println(String.valueOf(buf));
		}
	}
}