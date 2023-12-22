import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String longWord = "";
		Map<String, Integer> count = new HashMap<>();
		String tmp;
		String manyWord = "";
		int max = 0;
		while (sc.hasNext()) {
			if(!count.containsKey((tmp = sc.next()))){
				if(tmp.length() > longWord.length()){
					longWord = tmp;
				}
				count.put(tmp, 1);
			}else{
				count.put(tmp, count.get(tmp) + 1);
				if(max < count.get(tmp)){
					max = count.get(tmp);
					manyWord = tmp;
				}
			}
		}
		System.out.println(manyWord + " " + longWord);
	}
}
