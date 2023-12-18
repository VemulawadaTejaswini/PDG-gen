mport java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static int[] face = new int[6];

	public static void action(char action){
		int intTemp;
		switch(action){
		case 'W':
			intTemp = face[0];
			face[0] = face[2];
			face[2] = face[5];
			face[5] = face[3];
			face[3] = intTemp;
			break;
		case 'E':
			intTemp = face[0];
			face[0] = face[3];
			face[3] = face[5];
			face[5] = face[2];
			face[2] = intTemp;
			break;
		case 'N':
			intTemp = face[0];
			face[0] = face[1];
			face[1] = face[5];
			face[5] = face[4];
			face[4] = intTemp;
			break;
		case 'S':
			intTemp = face[0];
			face[0] = face[4];
			face[4] = face[5];
			face[5] = face[1];
			face[1] = intTemp;
			break;
		default :
			break;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 6; i++){
			face[i] = scan.nextInt();
		}
		int intLoop = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < intLoop; i++){
			int intNum1 = scan.nextInt();
			int intNum2 = scan.nextInt();
			//????????¶???(?????¢???????????´???)??§?????????
			int intAns = face[2];
			int intTemp;
			if(intNum1 == face[1]){
				intTemp = face[0];
				face[0] = face[1];
				face[1] = face[5];
				face[5] = face[4];
				face[4] = intTemp;
			}else if(intNum1 == face[2]){
				intTemp = face[0];
				face[0] = face[2];
				face[2] = face[5];
				face[5] = face[3];
				face[3] = intTemp;
			}else if(intNum1 == face[3]){
				intTemp = face[0];
				face[0] = face[3];
				face[3] = face[5];
				face[5] = face[2];
				face[2] = intTemp;
			}else if(intNum1 == face[4]){
				intTemp = face[0];
				face[0] = face[4];
				face[4] = face[5];
				face[5] = face[1];
				face[1] = intTemp;
			}else if(intNum1 == face[5]){
				intTemp = face[0];
				face[0] = face[5];
				face[5] = intTemp;
				intTemp = face[1];
				face[1] = face[4];
				face[4] = intTemp;
			}
			if(intNum2 == face[1]){
				list.add(face[2]);
			}else{
				list.add(face[3]);
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		scan.close();
	}
}