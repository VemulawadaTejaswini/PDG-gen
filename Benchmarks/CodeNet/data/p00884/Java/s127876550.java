
import java.util.*;
public class Main {
	// 2307 start
	
	HashSet<String> set;
	HashMap<String, String []> data;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			String first = null;
			String [] fvalue = null;
			data = new HashMap<String, String[]>();
			for(int i = 0; i < n; i++){
				String [] input = sc.next().replaceAll("\\.", "").split(":");
				data.put(input[0], input[1].split(","));
				if(i == 0){
					first = input[0];
					fvalue = data.get(first);
				}
			}
			set = new HashSet<String>();
			
			for(int i = 0; i < fvalue.length; i++){
				solve(fvalue[i]);
			}
			
			System.out.println(set.size());
			//debug
//			for(String s : set){
//				System.out.println(s);
//			}
		}
	}

	private void solve(String str) {
		if(data.containsKey(str)){
			String [] array = data.get(str);
			for(int i =0 ; i < array.length; i++){
				solve(array[i]);
			}
		}
		else{
			set.add(str);
			return ;
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}