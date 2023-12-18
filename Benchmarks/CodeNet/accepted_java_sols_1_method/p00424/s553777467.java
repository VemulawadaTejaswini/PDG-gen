import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<String,String> map = new HashMap<String,String>();
		while(N!=0){
			for(int i=0;i<N;i++){
				String[] st = br.readLine().split(" ");
				map.put(st[0],st[1]);
			}
			
			N = Integer.parseInt(br.readLine());
			for(int i=0;i<N;i++){
				String st = br.readLine();
				if(map.containsKey(st)){
					System.out.print(map.get(st));
				}else{
					System.out.print(st);
				}
			}
			System.out.println("");
			N = Integer.parseInt(br.readLine());
			map = new HashMap<String,String>();
		}
	}
}