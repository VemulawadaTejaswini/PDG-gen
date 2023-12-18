public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int[] dice = {1, 2, 3, 4, 5, 6};
		List<Integer> resultList = new ArrayList<Integer>();
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break; 
			
			int result = 0;
			for (int i = 0; i < n; i++) {
				String dist = sc.next();
				
				int tmp = 0;
				switch (dist) {
				case "North" :
					tmp = dice[0];
					dice[0] = dice[1];
					dice[1] = dice[5];
					dice[5] = dice[3];
					dice[3] = tmp;
					break;
				case "South" :
					tmp = dice[0];
					dice[0] = dice[3];
					dice[3] = dice[5];
					dice[5] = dice[1];
					dice[1] = tmp;
					break;
				case "East" :
					tmp = dice[0];
					dice[0] = dice[4];
					dice[4] = dice[5];
					dice[5] = dice[2];
					dice[2] = tmp;
					break;
				case "West" :
					tmp = dice[0];
					dice[0] = dice[2];
					dice[2] = dice[5];
					dice[5] = dice[4];
					dice[4] = tmp;
					break;
				case "Left" :
					tmp = dice[1];
					dice[1] = dice[4];
					dice[4] = dice[3];
					dice[3] = dice[2];
					dice[2] = tmp;
					break;
				case "Right" :
					tmp = dice[1];
					dice[1] = dice[2];
					dice[2] = dice[3];
					dice[3] = dice[4];
					dice[4] = tmp;
					break;
				default :
					break;
				}
				
				result += dice[0];
				System.out.println(result);
			}
			resultList.add(result);
		}
		
		for (int num : resultList) {
			System.out.println(num);
		}
	}
}