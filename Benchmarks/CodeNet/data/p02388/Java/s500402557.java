public class Main {
	public static int Cube(int x){
		int ans = 1;
		for(int i = 0; i < 3; i++){
			ans *= x;
		}
		return ans;
	}
}