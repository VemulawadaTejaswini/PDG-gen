import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		int size = 0;
		while(scan.hasNext()){
			int in = scan.nextInt();
			size = list.size();
			if(in == 0){
				System.out.printf("%d\n", list.get(size - 1));
				list.remove(size - 1);
			} else{
				list.add(in);
			}
		}
	}
}