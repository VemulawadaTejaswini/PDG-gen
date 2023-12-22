import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		int minv = list.get(0);
		int maxv = list.get(1) - list.get(0);
		for (int i = 1; i < n; i++) {
			maxv = max(maxv,minv,list.get(i));
			minv = min(minv,list.get(i));
		}
		System.out.println(maxv);
	}
	static int max(int maxv, int minv, int r){
		if(maxv > (r -minv) ){
			return maxv;
		}else{
			return r -minv;
		}
	}
	static int min(int minv, int r){
		if(minv > r){
			return r;
		}else{
			return minv;
		}
	}
}