import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		LinkedList<Integer> st = new LinkedList<Integer>();
		for(;;){
			if(!sc.hasNext()){
				break;
			}
			int n= sc.nextInt();
			if(n ==0){
				System.out.println(st.pop());
			}else{
				st.push(n);
			}
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}