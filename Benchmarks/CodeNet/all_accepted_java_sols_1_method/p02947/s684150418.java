import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		String sort = "";
		String[] anagram = new String[N];
		long count = 0;
		//文字列一つずつ並び替え
		for(int i = 0; i<N ; i++) {
			sort = sc.nextLine();
			String[] change = sort.split("");
			Arrays.sort(change);
			anagram[i] = String.join("",change);
		}
		//HashMapに一つずつ判定して入れる。重複があればカウント。
		HashMap<String,Long> checklist = new HashMap<>();
		for(int i = 0; i<N; i++) {
			if(checklist.containsKey(anagram[i])) {
				long value = checklist.get(anagram[i]);
				count+=value;
				checklist.put(anagram[i], value+1);
			}else {
				checklist.put(anagram[i],(long)1);
			}
		}
		System.out.println(count);
	}

}
