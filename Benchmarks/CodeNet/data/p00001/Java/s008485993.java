import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		Collections.addAll(list, 0,0,0);
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int sc = scan.nextInt();
			max(sc);
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

	public static void max(int sc) {
		for(int j=0;j<list.size();j++){
			if(list.get(j)<=sc){
				list.remove(2);
				list.add(j, sc);
				break;
			}
		}
	}
}