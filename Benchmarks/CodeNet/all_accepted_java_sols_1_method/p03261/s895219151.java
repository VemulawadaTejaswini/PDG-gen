import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		ArrayList<String> words = new ArrayList<String>();
		for(int i=0;i<N;i++){
			String w = sc.next();
			if(i !=0 ){
				String lastword = words.get(i-1);
				int wordcnt = lastword.length(); 
				Character initial = w.charAt(0);
				if(words.indexOf(w) != -1 || !(initial.equals(lastword.charAt(wordcnt-1)))){
				System.out.println("No");
				return;
				}
			}
			words.add(w);
		}
		System.out.println("Yes");
	}
}