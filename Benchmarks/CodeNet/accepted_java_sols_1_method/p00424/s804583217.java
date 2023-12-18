import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while (true){
			int n = Integer.valueOf(sc.nextLine());
			if(n == 0) break;
			Map<Character, Character> map = new TreeMap<>();
			for(int i = 0; i < n; i++){
				String line = sc.nextLine();
				char from = line.charAt(0);
				char to = line.charAt(2);
				map.put(from, to);
			}
			StringBuilder builder = new StringBuilder();
			int m = Integer.valueOf(sc.nextLine());
			for(int i = 0; i < m; i++){
				char in = sc.nextLine().charAt(0);
				builder.append(map.getOrDefault(in, in));
			}
			System.out.println(builder.toString());
		}
		sc.close();
	}
}