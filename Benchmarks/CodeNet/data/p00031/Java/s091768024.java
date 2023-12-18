import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[]list = new int[11];
	static int weight;
	public static void main(String[] args) {
		makeList();
		while(read()){
			solve();
		}
	}
	static void makeList(){
		list[0] = 1;
		for(int i = 1; i < 11; i++){
			list[i] = list[i-1]*2;
		}
		Arrays.sort(list);
	}
	static boolean read(){
		if(!sc.hasNext())
			return false;
		weight = sc.nextInt();
		return true;
	}
	static void solve(){
		ArrayList<Integer>ans = new ArrayList<Integer>();
		int index = 0;
		while(weight != 0){
			if(weight > list[index]){
				index++;
			}else if(weight < list[index]){
				weight = weight - list[index-1];
				ans.add(list[index-1]);
				index = 0;
			}else{
				weight = weight - list[index];
				ans.add(list[index]);
				index = 0;
			}
		}
		Collections.sort(ans);
		for(int i = 0; i < ans.size() - 1; i++){
			System.out.print(ans.get(i) + " ");
		}
		System.out.println(ans.get(ans.size()-1));
	}
}