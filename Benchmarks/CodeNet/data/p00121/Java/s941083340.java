import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static int hash(int ... nums){
		return (nums[0] << 21) + (nums[1] << 18) + (nums[2] << 15) + (nums[3] << 12) + (nums[4] << 9) + (nums[5] << 6) + (nums[6] << 3) + nums[7];
	}
	
	public static int swap(int h, int k){
		int from = 0;
		
		for(int i = 0; i < 8; i++){
			if(((h >> ((7 - i)*3)) & (0x0000000f >> 1)) == 0){
				from = i;
				break;
			}
		}
		
		int to = -1;
		
		switch(k){
		case 0: //hidari
			if(from % 4 == 0){
				break;
			}
			
			to = from - 1;
			break;
		case 1: //ue
			if((from / 4) == 0){
				break;
			}
			
			to = from - 4;
			break;
		case 2: //migi
			if(from % 4 == 3){
				break;
			}
			
			to = from + 1;
			break;
		case 3: //shita
			if(from / 4 == 1){
				break;
			}
			
			to = from + 4;
			break;
		}
		
		if(to == -1){
			return h;
		}
		
		int num = (h >> (7 - to)*3) & (0x0000000f >> 1);
		return h + (num << ((7 - from)*3)) - (num << ((7 - to)*3));
	}
	
	public static final int ANS = hash(0,1,2,3,4,5,6,7);
	
	public static void main(String[] args){
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		list.add(ANS);
		map.put(ANS, 0);
		
		int step = 1;
		while(!list.isEmpty()){
			LinkedList<Integer> tmp_list = new LinkedList<Integer>();
			
			for(int hash_num : list){
				for(int i = 0; i < 4; i++){
					int new_hash = swap(hash_num,i);
					if(hash_num == new_hash){
						continue;
					}
					
					if(map.containsKey(new_hash)){
						continue;
					}
					
					map.put(new_hash, step);
					tmp_list.add(new_hash);
				}
			}
			
			list.clear();
			list.addAll(tmp_list);
			step++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()){
			
			String str = sc.nextLine();
			
			String[] params = str.split(" ");
			int[] array = new int[params.length];
			for(int i = 0; i < params.length; i++){
				array[i] = Integer.parseInt(params[i]);
			}
			
			System.out.println(map.get(hash(array)));
			
		}
		
		
	}
	
}