import java.util.*;
public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int a, i=0, judge;
		while ((judge=sc.nextInt())>0){
			for (int j=1; j<judge+1; j++){
				list.add(a = sc.nextInt());
				i++;
			}
			Collections.sort(list);
			Collections.reverse(list);
			int sum = 0;
			for (int k=1; k<i-1; k++){
				sum = sum+list.get(k);
			}
			System.out.println((sum/(i-2)));
			i=0;
			list.clear();
		}
			
	}
	
}