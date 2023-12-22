import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		String word_before = sc.next();
		//int N = sc.nextInt();
      	//String word_arr[] = new String[N];
		String word_after = word_before.replaceAll("[0-9a-z]", "x");
		System.out.println(word_after);
      	
    }
		
}