import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		
		Map<Integer,Integer> data=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++) {
			
			int buf=sc.nextInt();
			
			
			
			if(data.containsKey(buf)) {
				
				int nokori=(data.get(buf)+1)%2;
				
				data.put(buf,nokori);
			}else {
				data.put(buf,1);
			}
			
		}
		
		int counter=0;
		
		for(Integer key:data.keySet()) {
			
			if(data.get(key)==1) {
				counter++;
			}
			
		}
		
		System.out.println(counter);

		
		sc.close();


	}



}
