import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		HashMap<Character,Integer> resultMap = new HashMap();
		for(int i = 0;i<line.length();i++) {
			Character tmp = line.charAt(i);
			if(resultMap.containsKey(tmp)) {
				resultMap.put(tmp, resultMap.get(tmp)+1);
			}else {
				resultMap.put(tmp, 0);
			}
		}
		
		String strResult = "No";

		if(resultMap.size() == 2) {
			 for(Integer t:resultMap.values()) {
				 if(resultMap.containsValue(t)) {
					 strResult = "Yes";
				 }
			 }
		}
		System.out.println(strResult);
		
	}
}