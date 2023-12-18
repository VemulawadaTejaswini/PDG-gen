import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0)break;
			HashMap<String,String> map = new HashMap<String,String>();
			for(int i = 0;i<n;i++){
				map.put(cin.next(), cin.next());
			}
			n = cin.nextInt();
			for(int i = 0;i<n;i++){
				String s =cin.next();
				if(map.containsKey(s)){
					System.out.print(map.get(s));	
				}
				else{
					System.out.print(s);
				}
				
			}
			System.out.println();
		}
	}
}