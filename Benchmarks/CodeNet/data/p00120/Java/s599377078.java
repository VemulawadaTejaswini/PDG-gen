import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String str = sc.nextLine();
			
			String[] params = str.split(" ");
			
			final int box_length = Integer.parseInt(params[0]);
			final int cakes = params.length - 1;
			int[] cake_len = new int[cakes];
			for(int i = 0; i < cakes; i++){
				cake_len[i] = Integer.parseInt(params[i+1]);
			}
			
			Arrays.sort(cake_len);
			
			List<Integer> list = new ArrayList<Integer>();
			boolean flag = true;
			for(int i = 0; i < cakes/2; i++){
				if(flag){
					list.add(0, cake_len[i]);
					list.add(cake_len[cakes - i - 1]);
					flag = false;
				}else{
					list.add(0, cake_len[cakes - i - 1]);
					list.add(cake_len[i]);
					flag = true;
				}
			}
			
			if(cakes == 1){
				list.add(cake_len[0]);
			}else if(cakes % 2 == 1){
				
				if(list.get(0) > cake_len[cakes/2]){
					list.add(0, cake_len[cakes/2]);
				}else{
					list.add(cake_len[cakes/2]);
				}
			}
			
			System.out.println(list);
			
			double sum = list.get(0) + list.get(cakes-1);
			
			for(int i = 0; i < cakes-1; i++){
				sum += 2 * Math.sqrt(list.get(i) * list.get(i+1));
			}
			//System.out.println(sum);
			if(sum <= box_length){
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}
		
		
	}
	
}