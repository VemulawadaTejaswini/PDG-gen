import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt(),W=sc.nextInt();
		String[][] map = new String[H][W];
		boolean[] getH = new boolean[H];
		boolean[] getW = new boolean[W];

 		for(int i=0;i<H;i++) {
 			map[i]=sc.next().split("");
			for(int j=0;j<W;j++) {
				if(map[i][j].equals("#")) {
					getH[i]=true;
					getW[j]=true;
				}
			}
		}

 		for(int i=0;i<H;i++) {
 			if(getH[i]) {
 				for(int j=0;j<W;j++) {
 					if(getW[j]) {
 						System.out.print(map[i][j]);
 					}
 				}
 				System.out.println();
 			}
 		}
	}
}