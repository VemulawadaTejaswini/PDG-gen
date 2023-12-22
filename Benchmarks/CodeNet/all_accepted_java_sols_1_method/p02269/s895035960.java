import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		HashSet<String> dictionary = new HashSet<>();
		List<String> answer = new ArrayList<>();
		String str;
		
		// 命令の数を受け取る
		int num = scan.nextInt();
		
		// 命令を受け取る
		for(int i = 0; i < num; i++){
			str = scan.next();
			switch(str){
				case "insert":
					dictionary.add(scan.next());
					break;
				case "find":
					if(dictionary.contains(scan.next())){
						answer.add("yes");
					} else {
						answer.add("no");
					}
					break;
			}
		}
		
		answer.forEach(System.out::println);
		
	}
}
