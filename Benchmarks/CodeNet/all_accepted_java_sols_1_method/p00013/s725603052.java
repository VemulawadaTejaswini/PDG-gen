import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		int y = cin.nextInt();
		if(y==0){
			return;
		}
		s.add(y);
		while(cin.hasNext()){
			int x = cin.nextInt();
			if(x==0){
				System.out.println(s.pop());
			}
			else{
				s.add(x);
			}
		}
	}

}