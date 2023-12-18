import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String[] st = sc.nextLine().split(" ");
		
		for(int i = 0; i < st.length; i++)
			if(map.containsKey(st[i]))
				map.put(st[i], map.get(st[i])+1);
			else
				map.put(st[i], 1);
		
		String max = st[0];
		int count = 0;
		for(int i = 0; i < st.length-1; i++){
			if(map.get(st[i]) < map.get(st[i+1]))max = st[i+1];
		    if(st[i].length() < st[i+1].length())count = i+1;
		}
			System.out.println(max + " " + st[count]);
			
			sc.close();
	}
}