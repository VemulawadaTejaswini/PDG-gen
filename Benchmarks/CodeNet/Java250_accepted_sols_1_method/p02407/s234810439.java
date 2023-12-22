import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int a = scan.nextInt();
			list.add(a);
		}

		for(int i = n - 1; i >= 0; i--){
			if(i != 0){
				System.out.printf("%d ", list.get(i));
			} else{
				System.out.printf("%d\n", list.get(i));
			}
		}
	}
}