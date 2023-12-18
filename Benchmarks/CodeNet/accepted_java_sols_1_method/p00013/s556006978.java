import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				int size = list.size();
				System.out.printf("%d\n", list.get(size - 1));
				list.remove(size - 1);
			} else{
				list.add(n);
			}
		}
	}
}