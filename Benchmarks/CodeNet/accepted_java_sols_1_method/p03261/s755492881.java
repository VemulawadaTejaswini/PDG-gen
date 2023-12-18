import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		po:for(int j = 0;j<n;j++){
			String l = "";
			for(int i = 0;i<n;i++){
				String po = sc.next();
				if(!po.substring(0,1).equals(l)){
					if(i > 0){
						break po;
					}
				}
				if(hash.containsKey(po)){
					break po;
				}else{
					hash.put(po, 1);
				}
				l = po.substring(po.length()-1);
				
			} 
			System.out.println("Yes");
			System.exit(0);
		}
		System.out.println("No");
		
		
		
	}
}
