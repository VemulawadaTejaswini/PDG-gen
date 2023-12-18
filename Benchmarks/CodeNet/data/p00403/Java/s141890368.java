import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Stack<Integer> a = new Stack<Integer>();
		int L = s.nextInt();
		for(int i=1; i<=L; i++){
			int b = s.nextInt();
			if(b > 0){
				if(a.search(b) != -1){  //入れる時の条件判断
					System.out.println(i);
					break;
				}else{
					a.push(b);
				}
	/*2,if*/}else{
				if(a.empty() || -b != a.peek()){  //出す時の条件判断
					System.out.println(i);
					break;
				}else{
					a.pop();
				}
			}//2,else
			if(i == L){
				System.out.println("OK");
			}
		}//for
	}//main
}//class
