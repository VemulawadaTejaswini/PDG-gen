import java.awt.geom.*;
import java.util.*;

public class Main {
	boolean [] isused;
	HashMap<Character, Integer>cmap;
	char [] clist;
	HashSet<Character> set;
	int ans;
	int chsize;
	HashMap<Character, Integer> leftmap;
	HashMap<Character, Integer> rightmap;
	HashSet<Character> first;
	
	private void dfs(int deep){
		char nowchar = clist[deep];
		for(int i =0; i < 10; i++){
			if(i == 0 && first.contains(nowchar)){
				continue;
			}
			if(! isused[i]){
				isused[i] = true;
				cmap.put(nowchar,i);
				if(deep + 1 == clist.length){
					calc();
				}
				else{
					dfs (deep + 1);
				}
				isused[i] = false;
			}
		}
	}
	
	private void calc(){
		//left
		int sum1 = 0, sum2 = 0;
//		for(int i = 0; i < 10; i ++){
//			if(isused[i] && leftmap.containsKey(cmap[i])){
//				int result = leftmap.get(cmap[i]) * i;
//				sum1 += result;
//			}
//		}
		for(Character key: leftmap.keySet()){
			int result = leftmap.get(key) * cmap.get(key);
			sum1 += result;
		}
		//right
//		for(int i = 0; i < 10; i ++){
//			if(isused[i] && rightmap.containsKey(cmap[i])){
//				int result = rightmap.get(cmap[i]) * i;
//				sum2 += result;
//			}
//		}
		for(Character key: rightmap.keySet()){
			int result = rightmap.get(key) * cmap.get(key);
			sum2 += result;
		}
		
		if(sum1 == sum2){
			ans++;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			String [] data = new String[n];
			set = new HashSet<Character>();
			ans = 0;
			
			//cmap = new char[10];
			cmap = new HashMap<Character, Integer>();
			isused = new boolean[10];
			leftmap = new HashMap<Character, Integer>();
			rightmap = new HashMap<Character, Integer>();
			first = new HashSet<Character>();
			
			for(int i = 0; i < n; i++){
				data[i] = sc.next();
				for(int j = 0; j < data[i].length();j++){
					set.add(data[i].charAt(j));
				}
			}
			chsize = set.size();
			clist = new char[chsize];
			int ind = 0;
			for(Character key: set){
				clist[ind++] = key;
			}
			
			//left
			for(int i = 0; i < n-1; i++){
				String str = data[i];
				int len = str.length();
				int rate = 1;
				for(int j = len -1; j >= 0; j--){
					char tempchar = str.charAt(j);
					if(leftmap.containsKey(tempchar)){
						leftmap.put(tempchar, leftmap.get(tempchar) + rate);
					}
					else{
						leftmap.put(tempchar, rate);
					}
					rate *= 10;
					
					//store a first
					if(len != 1 && j == 0){
						first.add(tempchar);
					}
				}
			}
			//right
			String str = data[n -1];
			int len = str.length();
			int rate = 1;
			for(int j = len -1; j >= 0; j--){
				char tempchar = str.charAt(j);
				if(rightmap.containsKey(tempchar)){
					rightmap.put(tempchar, rightmap.get(tempchar) + rate);
				}
				else{
					rightmap.put(tempchar, rate);
				}
				rate *= 10;
				//store a first
				if(len != 1 && j == 0){
					first.add(tempchar);
				}
			}
			dfs(0);
			
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}