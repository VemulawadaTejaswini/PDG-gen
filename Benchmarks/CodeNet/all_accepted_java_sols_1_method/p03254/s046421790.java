import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		ArrayList<Integer> children = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			children.add(sc.nextInt());
			
		}
		
		children.sort(null);
		
		int count =  0;
		
		for(int i = 0; i < n; i++) {
			
			int child = children.get(i);
			
			if(child < x) {
				if(i == n - 1) {
					break;
				}else {
					x = x - child;
					count++;
				}
			}else if(child == x){
				count++;
				break;
			}else {
				break;
			}
			
			
		}
		
		System.out.println(count);
		
	}

}
