
import java.util.*;

public class Main{
	static int N;
	static int[] bs = new int[10];
	static ArrayList<Integer> left = new ArrayList<Integer>();
	static ArrayList<Integer> right = new ArrayList<Integer>();
	static boolean ans;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		while(N-->0){
			for(int i = 0; i < 10; i++){
				bs[i] = s.nextInt();
			}
			
			left.clear();
			right.clear();
			left.add(bs[0]);
			for(int i = 1; i < 10; i++){
				if(bs[i] > left.get(left.size()-1)){
					left.add(bs[i]);
				}else{
					right.add(bs[i]);
				}
			}
			
			ans = true;
			for(int i = 0; i < right.size()-1; i++){
				if(right.get(i) >= right.get(i+1)){
					ans = false;break;
				}
			}			
			if(ans) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}