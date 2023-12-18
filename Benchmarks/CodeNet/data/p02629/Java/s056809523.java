import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		Stack<Character> stac = new Stack<>();
		while(n > 0){
			if(n%26 == 0){
				stac.add('z');
				n /= 26;
				n--;
			}else{
			stac.add((char)('a'+n%26 - 1));
			n /= 26;
			}

		}
		while(!stac.empty()){
			System.out.print(stac.pop());
		}




	}
}
