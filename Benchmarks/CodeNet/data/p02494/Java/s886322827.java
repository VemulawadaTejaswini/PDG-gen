import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt(), W = sc.nextInt();
		
		List<Integer> listH = new ArrayList<>();
		List<Integer> listW = new ArrayList<>();
		
		while(sc.hasNext()) {
			listH.add(sc.nextInt());
			listW.add(sc.nextInt());
		}
		
		for(int i = 0; i < listH.size(); i++) {
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