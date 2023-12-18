import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner cin = new Scanner(System.in);
		Map<Integer ,Integer> map = new HashMap<Integer,  Integer>();
		while(true){
			String str = br.readLine();
			if(str.equals("")){
				break;
			}
			String s[] = str.split(",");
			int com = Integer.parseInt(s[0]);
			if(map.containsKey(com)){
				
				int tmp = map.get(com);
				map.remove(com);
				map.put(com, tmp+1);
			}
			else{
				map.put(com, 1);

			}
		}


		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		while(true){
			String str = br.readLine();
			if(str == null){
				break;
			}
			String s[] = str.split(",");
			int com = Integer.parseInt(s[0]);
			if(map.containsKey(com)){
				if(!q.contains(com)){
					q.offer(com);	
				}
				
				int tmp = map.get(com);
				map.remove(com);
				map.put(com, tmp+1);
			}
		}
		
		while(!q.isEmpty()){
			System.out.println(q.peek() + " " + map.get(q.poll()));
		}
		
	}

}