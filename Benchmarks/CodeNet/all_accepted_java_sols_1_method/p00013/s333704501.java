import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		
		while(sc.hasNext()){
			int in = sc.nextInt();
			if (in == 0){
				int out = st.pop();
				System.out.println(out);
			}else{
				st.push(in);
			}
		}
		sc.close();
	}
}