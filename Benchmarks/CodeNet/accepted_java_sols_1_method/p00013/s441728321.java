import java.util.*;

public class Main
{
    Main(){
	Scanner sc = new Scanner(System.in);
	int n;
	Stack<Integer> stack = new Stack<Integer>();

	while(sc.hasNext()){
	    n = sc.nextInt();

	    if(n == 0){
		if(!stack.empty()) System.out.println(stack.pop().toString());
	    } else {
		stack.push(new Integer(n));
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}