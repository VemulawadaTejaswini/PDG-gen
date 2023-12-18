import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> Ans = new ArrayList<String>();
		String line;
		
		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			if(size == 0) break;
			food[] lunch = new food[size];
			for(int i=0; i<size; i++){
				line = in.readLine();
				String[] dst = line.split(" ");
				int w = Integer.parseInt(dst[1]);
				int s = Integer.parseInt(dst[2]);
				lunch[i] = new food(dst[0], w, s);
			}
			LunchSort(lunch);
			
			for(int i=0; i<size; i++){
				Ans.add(lunch[i].name);
			}
		}
		
		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}
	
	public void LunchSort(food[] lunch){
		int size = lunch.length;
		List<food> foods = new ArrayList<food>();
		int sum = 0;
		for(int i=0; i<size; i++){
			foods.add(lunch[i]);
			sum += lunch[i].w;
		}
		
		while(foods.size() != 0){
			int max_w = 0;
			int index = -1;
			for(int i=0; i<foods.size(); i++){
				if(sum-foods.get(i).w <= foods.get(i).s && max_w < foods.get(i).w){
					max_w = foods.get(i).w;
					index = i;
				}
			}
			
			lunch[size - foods.size()] = foods.get(index);
			sum -= foods.get(index).w;
			foods.remove(index);
		}		
	}
}

class food{
	String name;
	int w;
	int s;
	
	public food(String name, int w, int s){
		this.name = name;
		this.w = w;
		this.s = s;
	}
}