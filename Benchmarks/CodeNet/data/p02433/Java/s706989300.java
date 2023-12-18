import java.util.*;

public class Main{
	public static void main(String[] args){
		List<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> iterator = list.listIterator();
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for(int i = 0; i < n; i++){
			int cmd = scan.nextInt();

			switch(cmd){

				case 0:
					iterator.add(scan.nextInt());
					iterator.previous();
					break;

				case 1:
					int d = scan.nextInt();
					if(d > 0){
						for(int j = 0; j < d; j++) iterator.next();
					}
					else{
						for(int j = 0; j > d; j--) iterator.previous();
					}
					break;

				case 2:
					iterator.next();
					iterator.remove();
					break;
			}
		}
		for(Integer i : list) System.out.println(i);
	}
}

