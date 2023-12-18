import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		
		String str = "";
		boolean judge;
		
		while(sc.hasNext()){
			judge = true;
			String[] code = sc.nextLine().split(" ",0);
			String[] w = map.get(code[0]).split(" ",0);
			
			for(int i = 0; i < w.length; i++)
				if(code[1].equals(w[i]))judge = false;

			if(judge){
			if(map.containsKey(code[0]))
				map.put(code[0], map.get(code[0]) + " " + code[1]);
			else
				map.put(code[0], code[1]);
			}
		}
		
		while(sc.hasNext()){
			str = sc.nextLine();
			map.get(str);
		}
		sc.close();
	}
}