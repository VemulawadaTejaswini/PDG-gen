import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sheet = scan.nextInt();

		int[][] card = new int[4][13];

		for(int i=0; i<sheet; i++){
			String mark = scan.next();
			int nums = scan.nextInt();

			if(mark.equals("S")){
				card[0][nums-1] = i+1;
			}else if(mark.equals("H")){
				card[1][nums-1] = i+1;
			}else if(mark.equals("C")){
				card[2][nums-1] = i+1;
			}else if(mark.equals("D")){
				card[3][nums-1] = i+1;
			}
		}
		scan.close();
		for(int i=0; i<4; i++){
			for(int s=0; s<13; s++){
				if(card[i][s] == 0){
					if(i == 0){
						System.out.println("S " + s+1);
					}else if(i == 1){
						System.out.println("H " + s+1);
					}else if(i == 2){
						System.out.println("C " + s+1);
					}else if(i == 3){
						System.out.println("D " + s+1);
					}
				}
			}
		}
	}
}