import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		List<Integer> list= new ArrayList<>();
		boolean judge =false;

		list.add(a);
		list.add(b);
		list.add(c);
		Collections.sort(list);

		for(int i=0;i<list.size();i++) {
			if(i==0) {
				if(list.get(i)==5) {
					judge=true;
				}
				else {
					judge=false;
				}
			}
			if(i==1) {
				if(judge&&list.get(i)==5) {
					judge=true;
				}
				else {
					judge=false;
				}
			}
			if(i==2) {
				if(judge&&list.get(i)==7) {
					judge=true;
				}
				else {
					judge=false;
				}
			}
		}
		
		if(judge) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}