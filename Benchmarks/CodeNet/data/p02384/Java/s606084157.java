public class Main {

	int[] dice = new int[6];

	public Main(int[] nums, String order) {
		dice = nums;
	}

	public void move(String order) {

		for(Character s : order.toCharArray()) {
			int buf;
	        switch(s){
	            case 'N':{
	                buf = dice[0];
	                dice[0] = dice[1];
	                dice[1] = dice[5];
	                dice[5] = dice[4];
	                dice[4] = buf;
	                break;
	            }
	            case 'E':{
	                buf = dice[0];
	                dice[0] = dice[3];
	                dice[3] = dice[5];
	                dice[5] = dice[2];
	                dice[2] = buf;
	                break;
	            }
	            case 'W':{
	                buf = dice[0];
	                dice[0] = dice[2];
	                dice[2] = dice[5];
	                dice[5] = dice[3];
	                dice[3] = buf;
	                break;
	            }
	            case 'S':{
	                buf = dice[0];
	                dice[0] = dice[4];
	                dice[4] = dice[5];
	                dice[5] = dice[1];
	                dice[1] = buf;
	                break;
	            }
	        }
		}
	}

	public int[] checkRight(int upper, int front) {

		Random rnd = new Random();
		for(int i=0; i<10000; i++) {
			int r = rnd.nextInt(4);
			switch(r) {
				case 0:
					move("W");
					break;
				case 1:
					move("E");
					break;
				case 2:
					move("S");
					break;
				case 3:
					move("N");
					break;
				default:
					break;
			}
			if(dice[0] == upper && dice[1] == front) break;
		}

		return dice;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[6];
		for(int i=0; i<6; i++) {
			nums[i] = sc.nextInt();
		}

//		Dice dice = new Dice(nums, "");
		Main dice = new Main(nums, "");

//		String order = sc.next();

		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int upper = sc.nextInt();
			int front = sc.nextInt();
			int[] surface = dice.checkRight(upper, front);
			System.out.println(surface[2]);
		}
		sc.close();

	}

}
