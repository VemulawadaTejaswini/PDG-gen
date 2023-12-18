import java.util.Scanner;

public class Main {

	private static int[] first = new int[6];
	private static int[] second = new int[6];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 6; i++){
			first[i] = scan.nextInt();
		}
		for(int i = 0; i < 6; i++){
			second[i] = scan.nextInt();
		}

		for(int i = 0; i < 6; i++){
			if(first[0] == second[i]){
				action0(i);
				if(first[5] == second[5]){
					for(int j = 1; j <= 4; j++){
						if(first[1] == second[j]){
							action1(j);
						}
					}
				}
			}
		}
		if(check()){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		scan.close();
	}
	static void action0(int i){
		int intTemp;
		switch(i){
		case 1:
			intTemp = second[0];
			second[0] = second[1];
			second[1] = second[5];
			second[5] = second[4];
			second[4] = intTemp;
			break;
		case 2:
			intTemp = second[0];
			second[0] = second[2];
			second[2] = second[5];
			second[5] = second[3];
			second[3] = intTemp;
			break;
		case 3:
			intTemp = second[0];
			second[0] = second[3];
			second[3] = second[5];
			second[5] = second[2];
			second[2] = intTemp;
			break;
		case 4:
			intTemp = second[0];
			second[0] = second[4];
			second[4] = second[5];
			second[5] = second[1];
			second[1] = intTemp;
			break;
		case 5:
			intTemp = second[0];
			second[0] = second[5];
			second[5] = intTemp;
			intTemp = second[1];
			second[1] = second[4];
			second[4] = intTemp;
			break;
		default:
			break;
		}
	}
	static void action1(int j){
		int intTemp;
		switch(j){
		case 2:
			intTemp = second[1];
			second[1] = second[2];
			second[2] = second[4];
			second[4] = second[3];
			second[4] = intTemp;
			break;
		case 3:
			intTemp = second[1];
			second[1] = second[3];
			second[3] = second[4];
			second[4] = second[2];
			second[2] = intTemp;
			break;
		case 4:
			intTemp = second[1];
			second[1] = second[4];
			second[4] = intTemp;
			intTemp = second[2];
			second[2] = second[3];
			second[3] = intTemp;
			break;
		default :
		}
	}

	static boolean check(){
		if(first[0] == second[0] && first[1] == second[1] && first[2] == second[2] && first[3] == second[3] && first[4] == second[4] && first[5] == second[5]){
			return true;
		}else{
			return false;
		}
	}
}