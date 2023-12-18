import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		
		String str = "";
		
		while(sc.hasNext()){
			String[] code = sc.nextLine().split(" ",0);
			
			if(!(map.get(code[0]).equals(code[1]))){
			if(map.containsKey(code[0]))
				map.put(code[0], map.get(code[0]) + " " + code[1]);
			else
				map.put(code[0], code[1]);
			}
		}
		while(sc.hasNext()){
			str = sc.next();
			map.get(str);
		}
		sc.close();
	}
}