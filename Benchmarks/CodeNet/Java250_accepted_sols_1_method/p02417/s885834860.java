
import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		Map<Character , Integer >strs = new HashMap<>();
		
		for(int i = 97; i <= 122; i++) {
			strs.put((char)i,0);
		}
		//input
		while(scan.hasNext()) {
		    String str = scan.nextLine();
		    str = str.toLowerCase().replaceAll(" ","");
		    char[] str2 = str.toCharArray();
		    for(int i = 0; i < str2.length; i++) {
		        if(str2[i] > 96 && str2[i] < 123){
		            int	count = strs.get(str2[i]);
		            strs.put(str2[i],++count);
		        }
		    }
		}
		//output
	    for(int i = 97; i <= 122 ; i++) {
		System.out.println((char)i + " : " + strs.get((char)i)); 
		}
	}
}
		
		
