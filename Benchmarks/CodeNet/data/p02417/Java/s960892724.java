import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		
		Map<String,Integer> mapping= initializeAlphabetMapping();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String line = sc.next().toLowerCase();
			
			for(int i =0;i<line.length();i++){
				
				if(!Character.isAlphabetic(line.charAt(i))){
					continue;
				}
				
				String character = String.valueOf(line.charAt(i));
				
				mapping.put(character, mapping.get(character)+1);
				
			}
			
		}
		
		for(Entry<String,Integer> entry : mapping.entrySet()){
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
		sc.close();
		
	}

	private static Map<String, Integer> initializeAlphabetMapping() {
		
		HashMap<String,Integer> mapping = new LinkedHashMap<String,Integer>(){
				{
					put("a",0);
					put("b",0);
					put("c",0);
					put("d",0);
					put("e",0);
					put("f",0);
					put("g",0);
					put("h",0);
					put("i",0);
					put("j",0);
					put("k",0);
					put("l",0);
					put("m",0);
					put("n",0);
					put("o",0);
					put("p",0);
					put("q",0);
					put("r",0);
					put("s",0);
					put("t",0);
					put("u",0);
					put("v",0);
					put("w",0);
					put("x",0);
					put("y",0);
					put("z",0);
				
				}
		};
		
		return mapping;
	}
}

