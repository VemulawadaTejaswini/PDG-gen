import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		for(;;){
			int x = scan.nextInt();
			if(x == 0){
				break;
			}
			list.add(x);
		}

		for(int i = 0; i < list.size(); i++){
			System.out.printf("Case %d: %d\n", i + 1, list.get(i));
		}
	}
}