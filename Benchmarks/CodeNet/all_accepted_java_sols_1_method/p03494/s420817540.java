
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> temp = new ArrayList();
		
		for(int i = 0; i < n; i++) {
			int hoge = sc.nextInt();
			temp.add(hoge);
		}
		
		boolean even = true;
		int time = 0;
		
		List<Integer> newOne = new ArrayList();
		
		while(even) {
			
			
			for(int i = 0; i < temp.size(); i++) {
				int current = temp.get(i);
				if(current % 2 >= 1) {
					even  = false;
					time--;
					break;
				}else {
					newOne.add(current / 2);
				}
			}
			
			temp.clear();
			temp.addAll(newOne);
			newOne.clear();
			time++;
			
		}
		
		System.out.println(time);
		
	}

}
