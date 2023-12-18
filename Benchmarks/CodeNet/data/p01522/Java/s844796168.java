import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>();
	static int N, K;
	static boolean[] areYouFine;
	static int[][] pair;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		N = sc.nextInt();
		areYouFine = new boolean[N];
		Arrays.fill(areYouFine, true);
		K = sc.nextInt();
		for(int i = 0; i < K; i++){
			int rideOn = sc.nextInt();
			HashSet<Integer> boat = new HashSet<Integer>();
			for(int j = 0; j < rideOn; j++){
				boat.add(sc.nextInt());
			}
			list.add(boat);
		}
		int row = sc.nextInt();
		pair = new int[row][2];
		for(int i = 0; i < pair.length; i++){
			pair[i][0] = sc.nextInt();
			pair[i][1] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		int res = 0;
		for(int i = 0; i < pair.length; i++){
			int rabbit1 = pair[i][0], rabbit2 = pair[i][1];
			for(int j = 0; j < list.size(); j++){
				HashSet<Integer> boat = list.get(j);
				if(!boat.isEmpty() && boat.contains(rabbit1) && boat.contains(rabbit2)){
					areYouFine[rabbit1] = false;
					areYouFine[rabbit2] = false;
				}
			}
		}
		for(int i = 0; i < areYouFine.length; i++){
			if(!areYouFine[i])res++;
		}
		System.out.println(res);
	}
}