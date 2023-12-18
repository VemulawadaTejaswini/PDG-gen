import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] area = new int[12][12];

		while(sc.hasNextLine()) {
			int count = 0;
	
			for(int i = 0;i < 12 ;i++) {
				char[] nums = sc.nextLine().toCharArray();
				for(int j = 0;j < 12;j++) {
					area[i][j] = Character.getNumericValue(nums[j]);
				}
			}
	
			for(int i = 0;i < 12 ;i++) {
				for(int j = 0;j < 12;j++) {
					if(area[i][j] == 1 ) {
						count++;
						area = checkIsland(area, i , j);
	
					}
				}
			}
			sc.nextLine();
			System.out.println(count);
		}

	}


	public static int[][] checkIsland(int[][] area,int i,int j) {
		area[i][j] = 0;

		if(j < 11) {
			if(area[i][j + 1] == 1) {
				area = checkIsland(area, i,j + 1);
			}
		}
		if(i < 11) {
			if(area[i + 1][j] == 1) {
				area = checkIsland(area,i + 1, j);
			}
		}
		if(j > 0) {
			if(area[i][j - 1] == 1) {
				area = checkIsland(area, i,j - 1);
			}
		}
		if(i > 0) {
			if(area[i - 1][j] == 1) {
				area = checkIsland( area, i - 1, j);
			}
		}

		return area;

	}
}