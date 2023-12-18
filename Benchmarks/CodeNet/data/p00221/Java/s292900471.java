import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt(), m = sc.nextInt(), p = 0;
	    if(n+m == 0) break;
	    Queue<Integer> que = new LinkedList<Integer>();
	    for(int i = 1; i <= n; i++) que.add(new Integer(i));
	    for(int i = 1; i <= m; i++){
		String str = sc.next();
		int s = i%3, t = i%5;
		boolean f = false;
		if(s+t == 0){
		    if(str.equals("FizzBuzz")) f = true;
		} else if(s == 0){
		    if(str.equals("Fizz")) f = true;
		} else if(t == 0){
		    if(str.equals("Buzz")) f = true;
		} else {
		    if(str.equals(String.valueOf(i))) f = true;
		}

		if(f) que.add(que.poll());
		else que.poll();
	    }

	    int[] a = new int[que.size()+1];
	    while(que.size() > 0) a[p++] = que.poll();
	    Arrays.sort(a);
	    System.out.print(String.valueOf(a[1]));
	    for(int i = 2; i <= p; i++) System.out.print(" "+String.valueOf(a[i]));
	    System.out.println();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}