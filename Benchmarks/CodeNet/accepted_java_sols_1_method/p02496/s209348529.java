import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean card[][] = new boolean [4][14];
		int cnt = in.nextInt();
		String mark;
		int num;
		for(int i = 0; i < cnt; i++){
			mark = in.next();
			num = in.nextInt();
			if(mark.equals("S")){
				card[0][num] = true;
			}
			else if(mark.equals("H")){
				card[1][num] = true;
			}
			else if(mark.equals("C")){
				card[2][num] = true;
			}
			else if(mark.equals("D")){
				card[3][num] = true;
			}
		}
		for(int i = 0; i < 4; i++){
			for(int k = 1; k < 14; k++){
				if(card[i][k] == false){
					if(i == 0){
						System.out.println("S " + k);
					}
					else if(i == 1){
						System.out.println("H " + k);
					}
					else if(i == 2){
						System.out.println("C " + k);
					}
					else if(i == 3){
						System.out.println("D " + k);
					}
				}
			}
		}
	}

}