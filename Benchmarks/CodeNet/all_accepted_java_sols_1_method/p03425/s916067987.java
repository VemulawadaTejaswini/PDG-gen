import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			
			String [] S = new String[N];
			Map<String,Integer>map = new HashMap<String,Integer>();
			for(int i = 0;i<N;i++) {
				S[i] = scan.next();
				char a = S[i].charAt(0);
				
				if(a=='M'||a=='A'||a=='R'||a=='C'||a=='H') {
					if(map.containsKey(S[i].substring(0, 1))){
						map.put(S[i].substring(0, 1), map.get(S[i].substring(0, 1))+1);
						}else {
							map.put(S[i].substring(0, 1), 1);
						}
				}
			}
			
			long []shu = new long[map.size()];
			int k = 0;
			for(String key:map.keySet()) {
				shu[k] = map.get(key);
				k++;
			}
			
			long goukei = 0;
			
			if(map.size()<3) {
				System.out.println(0);
				
			}else{
				
				for(int i = 0;i<map.size()-2;i++) {
					for(int j = i+1;j<map.size()-1;j++) {
						for(int z=j+1;z<map.size();z++) {
							
							goukei+=shu[i]*shu[j]*shu[z];
							//System.out.println(shu[i]*shu[j]*shu[z]);
						}
					}
				}
				
				System.out.println(goukei);
				
			}
			
			
			
				
			
		}
		
		
	}
		

}
