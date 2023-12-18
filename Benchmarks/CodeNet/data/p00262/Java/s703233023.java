import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	static boolean check(ArrayList <Integer> b) {
		if(b.get(0) != 1) {
			return false;
		}
		for(int i = 1; i < b.size(); i++) {
			if(b.get(i-1) != b.get(i)-1) {
				return false;
			}
		}
		return true;
	}
	
	static boolean gap(ArrayList <Integer> b) { 
		for(int i = 0; i < b.size(); i++) {
			if(b.get(i) <= 0) {
				return false;
			}
		}
		return true;
	}
	
	static void removeGap(ArrayList <Integer> b) {
		for(int i = 0; i < b.size(); i++) {
			if(b.get(i) <= 0) {
				b.remove(i);
				i--;
				
				continue;
			}
		}
		b.trimToSize();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			int N = stdIn.nextInt();
			if(N == 0) {
				break;
			}
			
			
			for(int i = 0; i < N; i++) {
				list.add(stdIn.nextInt());
			}
			int c = 0;
			while(!check(list) && c < 10000) {
				c++;
				if(gap(list)) {
					int size = list.size();
					for(int i = 0; i < list.size(); i++) {
						list.set(i,list.get(i)-1);
					}
					list.add(size);
				}
				removeGap(list);
			}
			System.out.println((check(list))?c:-1);
			list.clear();
			list.trimToSize();
		}
		
		

	}

}