import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int team_number, minutes, seconds;
	static Map<Integer, Integer>map = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		while(read()){
			slove();
			map.clear();
		}

	}
	static boolean read(){
		team_number = sc.nextInt();
		if(team_number == 0)return false;

		for(int i = 0; i < team_number; i++){
			int index = sc.nextInt();
			int sum = 0;
			for(int j = 0; j < 4; j++){
				minutes = sc.nextInt();
				seconds = sc.nextInt();
				sum += minutes*60 + seconds;
			}
			map.put(index, sum);
		}
		return true;
	}
	static void slove(){
		int score = Integer.MAX_VALUE;
		int res = 0;
		for(int i = 1; i <= 1000000; i++){
			if(map.containsKey(i)){
				if(score > map.get(i)){
					score = map.get(i);
					res = i;
				}
			}
		}

		System.out.println(res);
		map.remove(res);

		score = Integer.MAX_VALUE;
		res = 0;
		for(int i = 1; i <= 1000000; i++){
			if(map.containsKey(i)){
				if(score > map.get(i)){
					score = map.get(i);
					res = i;
				}
			}
		}
		System.out.println(res);

		score = Integer.MIN_VALUE;
		res = 0;
		for(int i = 1; i <= 1000000; i++){
			if(map.containsKey(i)){
				if(score < map.get(i)){
					score = map.get(i);
					res = i;
				}
			}
		}
		map.remove(res);

		score = Integer.MIN_VALUE;
		res = 0;
		for(int i = 1; i <= 1000000; i++){
			if(map.containsKey(i)){
				if(score < map.get(i)){
					score = map.get(i);
					res = i;
				}
			}
		}
		System.out.println(res);
	}
}