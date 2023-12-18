import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int i = 0;
		
		ArrayList<Integer> fas = new ArrayList<Integer>();
		ArrayList<Integer> has = new ArrayList<Integer>();
		ArrayList<Integer> las = new ArrayList<Integer>();
		ArrayList<Integer> las2 = new ArrayList<Integer>();
		int counta=0;
		
		try {
			tmp = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		counta = Integer.parseInt(tmp);
		
		for(i=0;i<counta;i++){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			String[] sprite = tmp.split(" ");
			
			fas.add(Integer.parseInt(sprite[0]));
			has.add(Integer.parseInt(sprite[1]));
			
			
		}
		
		int max = 0;
		
		for(i=0;i<counta;i++){
			if(max <= has.get(i)){
				max = has.get(i);
			}
			
			
		}
		
		for(i=0;i<counta;i++){
			if(max == has.get(i)){
				las.add(fas.get(i));
				las2.add(has.get(i));
			}
			
		}
		
		int rrr;
		
		for(i=0;i<las.size();i++){
			for(int j=0;j<las.size();j++){
				if(las.get(j) > las.get(i)){
					rrr = las.get(i);
					las.set(i, las.get(j));
					las.set(j, las.get(i));
					rrr = las2.get(i);
					las2.set(i, las2.get(j));
					las2.set(j, las2.get(i));
				}
			}
		}
		
		System.out.println(las.get(0)+" "+las2.get(0));
		
	}
}