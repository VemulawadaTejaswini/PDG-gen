import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int productNum = sc.nextInt();
		int choiseNum = sc.nextInt();
		int totalNum = 0;
		List<Integer> list = new ArrayList<>();
		int num = 0;

		for (int i = 1; i <= productNum; i++ ) {
			num = sc.nextInt();
			list.add(num);
			totalNum += num;
		}


		Collections.sort(list);
		Collections.reverse(list);
		
		for (int i = 1; i <= choiseNum; i++) {
		    if ((list.get(i-1) * 4 * choiseNum) < totalNum) {
		      System.out.println("No");
		      return;  
		    }
		}
		
		System.out.println("Yes");
	}
}