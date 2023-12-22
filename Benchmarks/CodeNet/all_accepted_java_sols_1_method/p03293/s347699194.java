import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = sc.next();
		int count = 0;
		int max = 0;
		LinkedList<String> word = new LinkedList<String>();
		LinkedList<String> Ans = new LinkedList<String>();

		for (int i = 0; i < str.length(); i++) {
		    String str2 = String.valueOf(str.charAt(i));
		    String ans2 = String.valueOf(ans.charAt(i));
		    word.add(str2);
		    Ans.add(ans2);
		}
		for(int i=0; i<str.length(); i++){
			word.addFirst(word.getLast());
			word.removeLast();
			if(word.equals(Ans)){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
