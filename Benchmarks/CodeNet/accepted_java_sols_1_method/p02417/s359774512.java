import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character,Integer> map = new LinkedHashMap<>();

		for(char ch='a'; ch<='z'; ch++) {
			map.put(ch,0);
		}


		while(sc.hasNextLine()) {
			String str=sc.nextLine();
			String str2 = str.toLowerCase();
			for(int i=0; i<str2.length(); i++) {
				char ch = str2.charAt(i);

				if(map.get(ch)!=null) {
					map.put(ch,map.get(ch)+1);
				}
			}
		}

		for(Character ch : map.keySet()) {
			System.out.println(ch +" : "+map.get(ch));
		}

	}
}
