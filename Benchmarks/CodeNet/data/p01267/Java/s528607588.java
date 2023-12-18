import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;

public class Main {

	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			
			if((n|a|b|c|x) == 0){
				break;
			}
			
			Queue<Integer> y = new ConcurrentLinkedQueue<Integer>();
			for(int i =0 ; i< n ; i++){
				y.add(sc.nextInt());
			}
						
			Function<Integer,Integer> next = xx -> (a*xx+b)%c;
			
			System.out.println(solve(next,x,y));
		}
	}
	
	
	int solve(final Function<Integer,Integer> nextNum, int x, Queue<Integer>y){		
		int c_ = 0;
		final int MAX = 10000;
		for(;c_ <= MAX; c_++,x = nextNum.apply(x)){
			if(x == y.peek()){
				y.poll();
				if(y.isEmpty()) {
					break;
				}
			}
		}
		return y.isEmpty()? c_ :-1;
	}
}