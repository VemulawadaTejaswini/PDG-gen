import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

	public int[] checkSurfaces() {
		return dice;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Boolean sameFlag = false;

		int[] nums1 = new int[6];
		int[] nums2 = new int[6];
		for(int i=0; i<6; i++) {
			nums1[i] = sc.nextInt();
		}

		for(int i=0; i<6; i++) {
			nums2[i] = sc.nextInt();
		}

		Main dice1 = new Main(nums1, "");
		Main dice2 = new Main(nums2, "");

		// 共通の数値２つを取り出す
		int upper = -1;
		int front = -1;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(nums1[i] == nums2[j]) upper = nums1[i];
			}
		}
		for(int i=0; i<6; i++) {
			if(nums1[i] == upper) continue;
			for(int j=0; j<6; j++) {
				if(nums1[i] == nums2[j]) front  = nums1[i];
			}
		}

		sc.close();

		int[] surface1 = dice1.checkRight(upper, front);
		int[] surface2 = dice2.checkRight(upper, front);

		if(Arrays.equals(surface1, surface2)) sameFlag = true;

		if(sameFlag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
