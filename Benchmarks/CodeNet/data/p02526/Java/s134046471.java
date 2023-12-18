import java.util.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			list.add(in.nextInt());
		}
		Collections.sort(list);
		int q = in.nextInt();
		int cnt = 0;
		for(int i = 0; i < q; i++){
			int value = in.nextInt();
			for(int k = 0; k < n; k++){
				if(value < list.get(k)) break;
				if(value == list.get(k)){
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}