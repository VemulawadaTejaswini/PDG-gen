import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> A = new ArrayDeque<String>();
		ArrayDeque<String> B = new ArrayDeque<String>();

		int exit=0;
		while(exit==0){
			String s = sc.next();
			if(s.compareTo("quit")==0){
				exit=1;
			}else if(s.compareTo("push")==0){
				A.push(sc.next());
			}else if(s.compareTo("pop")==0){
				B.push(A.pop());
			}
		}
		
		int x = B.size();
		for(int i=0;i<x;i++){
			System.out.println(B.pollLast());
		}
		
	}
}