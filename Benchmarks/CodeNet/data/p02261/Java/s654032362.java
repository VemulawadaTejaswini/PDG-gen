import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		Cards input[] = new Cards[len];
		int count = 0;
		Main main = new Main();

		for (int i = 0; i < len; i++) {
			input[i] 		= main.new Cards();
			input[i].suits 	= scanner.next();
			input[i].num 	= Integer.parseInt(input[i].suits.substring(1));
		}
		Cards buble[] = new Cards[len];
		System.arraycopy(input, 0, buble, 0, input.length);
		
		//buble sort
		for (int i = 0; i < buble.length; i++) {
			for (int j = 1; j < buble.length; j++) {
				if (buble[j-1].num > buble[j].num) {
					Cards tmp = buble[j-1];
					buble[j-1] = buble[j];
					buble[j] = tmp;
				}
			}
		}
		new Main().arrayToString(buble);
		System.out.println("Stable");
		
		Cards select[] = new Cards[len];
		System.arraycopy(input, 0, select, 0, input.length);
		
		//selection sort
		for (int i = 0; i < select.length; i++) {
			Cards minValue = select[i];
			for (int j = i; j < select.length; j++) {
				if(minValue.num > select[j].num) {
					Cards tmp = select[j];
					select[j] = minValue;
					minValue = tmp;
					select[i] = minValue;					
				}
			}
		}
		new Main().arrayToString(select);
		
		Boolean isSame = true;
		for (int i = 0; i < select.length; i++) {
			if(select[i].suits != buble[i].suits) {
				isSame = false;
			}
		}
		if (isSame) {
			System.out.println("Stable");
		}else {
			System.out.println("Not stable");
		}
	}

	public void arrayToString(Cards[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i].suits);
			} else {
				System.out.print(arr[i].suits + " ");
			}
		}
	}
	
	class Cards{
		int num;
		String suits;
	}
	
	public void isStable() {
		
		System.out.println();
	}
	
//	public Map<String, Integer> heartsToNum(String[]	hearts ) {
//		Map<String, Integer> retMap = new HashMap<>();
//		for (int i = 0; i < hearts.length; i++) {
//			int	num  = 	Integer.parseInt(hearts[i].substring(1, 1));
//			retMap.put(hearts[i], num);
//		}
//		return retMap;
//	}

}
