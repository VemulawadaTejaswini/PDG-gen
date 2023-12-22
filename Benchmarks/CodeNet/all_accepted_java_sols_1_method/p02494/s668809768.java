import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> listH = new ArrayList<>();
		List<Integer> listW = new ArrayList<>();
		
		listH.add(Integer.MIN_VALUE);
		listW.add(Integer.MIN_VALUE);
		
		int cnt = 0;
		
		while(listH.get(cnt) != 0 || listW.get(cnt) != 0) {
			listH.add(sc.nextInt());
			listW.add(sc.nextInt());
			
			if(listH.get(cnt) == 0 && listW.get(cnt) == 0) {
				break;
			}
			
			cnt++;
		}
		
		for(int i = 1; i < listH.size() - 1; i++) {
			for(int j = 0; j < listH.get(i); j++) {
				for(int k = 0; k < listW.get(i); k++) {
					System.out.print("#");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
}