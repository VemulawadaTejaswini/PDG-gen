
import java.util.*;
class Main { 
	public static void main (String...args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		List<String>tList = new ArrayList<>();
		while(scan.hasNext()){
             String str = scan.next().toLowerCase();
			 tList.add(str);
		}
		for(int i = 0; i < tList.size(); i++) {
			if(w.equals(tList.get(i))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
	
