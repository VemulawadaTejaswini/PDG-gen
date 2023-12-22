import java.util.*;

class Main{
	public static void main(String args[]){
		int[][] buil1 = new int[3][10];
		int[][] buil2 = new int[3][10];
		int[][] buil3 = new int[3][10];
		int[][] buil4 = new int[3][10];

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for(int i=0; i<num; i++){
			switch(scan.nextInt()){
				case 1: //A?£?
					buil1[(scan.nextInt()-1)][(scan.nextInt()-1)] += scan.nextInt();
					break;
				case 2: //B?£?
					buil2[(scan.nextInt()-1)][(scan.nextInt()-1)] += scan.nextInt();
					break;
				case 3: //C?£?
					buil3[(scan.nextInt()-1)][(scan.nextInt()-1)] += scan.nextInt();
					break;
				case 4: //D?£?
					buil4[(scan.nextInt()-1)][(scan.nextInt()-1)] += scan.nextInt();
					break;
				default :
					break;
			}
		}
		//A?£??????¨???
		for(int i=0; i<3; i++){
			for(int k=0; k<10; k++){
				System.out.print(" " + buil1[i][k]);
			}
			System.out.println("");
		}
		for(int i=0; i<20; i++){
			System.out.print("#");
		}
		System.out.println("");

		//B?£??????¨???
		for(int i=0; i<3; i++){
			for(int k=0; k<10; k++){
				System.out.print(" " + buil2[i][k]);
			}
			System.out.println("");
		}
		for(int i=0; i<20; i++){
			System.out.print("#");
		}
		System.out.println("");

		//C?£??????¨???
		for(int i=0; i<3; i++){
			for(int k=0; k<10; k++){
				System.out.print(" " + buil3[i][k]);
			}
			System.out.println("");
		}
		for(int i=0; i<20; i++){
			System.out.print("#");
		}
		System.out.println("");

		//D?£??????¨???
		for(int i=0; i<3; i++){
			for(int k=0; k<10; k++){
				System.out.print(" " + buil4[i][k]);
			}
			System.out.println("");
		}
	}
}