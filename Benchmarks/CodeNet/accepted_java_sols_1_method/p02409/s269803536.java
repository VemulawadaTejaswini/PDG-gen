import java.util.*;
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int[][][] hs = new int[4][3][10];

		
		for(int i=0;i<n;i++){
			int b = sc.nextInt();
		    int f = sc.nextInt();
		    int r = sc.nextInt();
			int v = sc.nextInt();
			
			hs[b-1][f-1][r-1] += v;
		}

		for(int r=0;r<4;r++){
			for(int y=0;y<3;y++){
				for(int o=0;o<10;o++){

					System.out.print(" " + hs[r][y][o]);
					if(o==9){
						System.out.println();
					}
				}
			}
			if(r != 3){
				System.out.println("####################");
			}
		}
	}
}
