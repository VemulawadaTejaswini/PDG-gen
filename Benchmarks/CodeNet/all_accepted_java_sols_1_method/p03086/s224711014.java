import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("A", "1");
		map.put("C", "1");
		map.put("G", "1");
		map.put("T", "1");
		Scanner sc = new Scanner(System.in);
		String[] list = sc.nextLine().split("");
		
		int cnt=0;
		int max_cnt=0;
		for(int i=0;i<list.length;i++) {
			cnt=0;
			if(map.containsKey(list[i])) {
				cnt++;
				for(int j=i+1;j<list.length;j++) {
					if(map.containsKey(list[j])) {
						cnt++;
					}
					else {
						break;
					}
				}
			}
			if(max_cnt<cnt) max_cnt=cnt;
		}
		System.out.println(max_cnt);
	}
}