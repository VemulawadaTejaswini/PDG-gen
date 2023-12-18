import java.util.*;

public class Main{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);

		// input
		for(int i=0; i<10; i++){
			list.add(scan.nextInt());
		}
		// sort
		Collections.sort(list);
		Collections.reverse(list);

		// output
		for(int i=0; i<3; i++){
			System.out.println(list.get(i));
		}

	}
}