import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static class Dropping_Ink {
		void print_FieldNum() {
			int[][] field = new int[10][10];
			for(int[] fi:field) {
				for(int f:fi) {f = 0;}
			}

			//String input_diInfo;
			while(sc.hasNext()) {
				String[] diInfo = sc.nextLine().split(",", 0);
				int x = Integer.parseInt(diInfo[0]);
				int y = Integer.parseInt(diInfo[1]);
				int inkSize = Integer.parseInt(diInfo[2]);

				switch(inkSize) {
					case 3:
						int[][] point_largeInk =
						{{x+0, y-2},{x+2, y+0},{x+0, y+2},{x-2, y+0}};
						point_dropInk(field, point_largeInk);
					case 2:
						int[][] point_middleInk =
						{{x+1, y-1},{x+1, y+1},{x-1, y+1},{x-1, y-1}};
						point_dropInk(field, point_middleInk);
					case 1:
						int[][] point_smallInk =
						{{x+0, y-1},{x+1, y+0},{x+0, y+1},{x-1, y+0}};
						point_dropInk(field, point_smallInk);
				}
			}

			int num_clearField = 0;
			int max_inkField = 0;
			for(int[] fi:field) {
				for(int f:fi) {
					if(f == 0)
						num_clearField++;
					if(f > max_inkField)
						max_inkField = f;
				}
			}
			System.out.println(num_clearField);
			System.out.println(max_inkField);
		}

		void point_dropInk(int[][] field, int[][] dropPoint) {
			for(int i=0; i<4; i++) {
				if(dropPoint[i][0] >= 0 && dropPoint[i][1] >= 0 &&
				   dropPoint[i][0] <= 9 && dropPoint[i][1] <= 9)
					field[dropPoint[i][0]][dropPoint[i][1]]++;
			}
		}
	}

	public static void main(String[] args) {
		Dropping_Ink di = new Dropping_Ink();
		di.print_FieldNum();
	}
}