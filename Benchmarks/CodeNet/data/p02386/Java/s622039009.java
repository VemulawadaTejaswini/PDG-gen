import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		int decTimes = scan.nextInt();
		int diceNum[][] = new int[decTimes][6];
		boolean sameDice = false;
		diceClass dice = new diceClass();

		for (int i=0; i<decTimes; i++){
			for (int ii=0; ii<6; ii++){
				diceNum[i][ii] = scan.nextInt();
			}
		}
		int[] diceA = new int[6];
		int[] diceB = new int[6];

		//??????????????°???????????£??\??????
		for(int iA=0; iA<decTimes; iA++){
			diceA[0] = diceNum[iA][0];
			diceA[1] = diceNum[iA][1];
			diceA[2] = diceNum[iA][2];
			diceA[3] = diceNum[iA][3];
			diceA[4] = diceNum[iA][4];
			diceA[5] = diceNum[iA][5];
			for(int iB=0; iB<decTimes; iB++){
				if(iA != iB){
					diceB[0] = diceNum[iB][0];
					diceB[1] = diceNum[iB][1];
					diceB[2] = diceNum[iB][2];
					diceB[3] = diceNum[iB][3];
					diceB[4] = diceNum[iB][4];
					diceB[5] = diceNum[iB][5];
				}
				//??????????????¢?????????????????????
				for(int rotate1=0; rotate1<4; rotate1++){
					for(int rotate2=0; rotate2<4; rotate2++){
						for(int rotate3=0; rotate3<4; rotate3++){
							sameDice = dice.compare(diceA, diceB);
							if(sameDice == true){
								break;
							}
							diceB = dice.move(rotate1);
							sameDice = dice.compare(diceA, diceB);
							if(sameDice == true){
								break;
							}
							diceB = dice.move(rotate2);
							sameDice = dice.compare(diceA, diceB);
							if(sameDice == true){
								break;
							}
							diceB = dice.move(rotate3);
							sameDice = dice.compare(diceA, diceB);
							if(sameDice == true){
								break;
							}
						}
						if(sameDice == true){
							break;
						}
					}
					if(sameDice == true){
						break;
					}
				}
				if(sameDice == true){
					break;
				}
			}
			if(sameDice == true){
				break;
			}
		}

		if(sameDice == true){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}

class diceClass{	
	int pos[] = new int[6];
	int up0[] = {1,2,4,3};
	int up1[] = {0,3,5,2};
	int up2[] = {0,1,5,4};
	int up3[] = {0,4,5,1};
	int up4[] = {0,2,5,3};
	int up5[] = {1,3,4,2};
	public diceClass(){

	}

	public int[] move(int direction){		//?????????????????¢?????????????????°????????????
		int[] temp = (int[])pos.clone();
		if(direction == 0){
			pos[0] = temp[1];
			pos[1] = temp[5];
			pos[2] = temp[2];
			pos[3] = temp[3];
			pos[4] = temp[0];
			pos[5] = temp[4];
		}
		else if(direction == 1){
			pos[0] = temp[3];
			pos[1] = temp[1];
			pos[2] = temp[0];
			pos[3] = temp[5];
			pos[4] = temp[4];
			pos[5] = temp[2];
		}
		else if(direction == 2){
			pos[0] = temp[2];
			pos[1] = temp[1];
			pos[2] = temp[5];
			pos[3] = temp[0];
			pos[4] = temp[4];
			pos[5] = temp[3];
		}
		else if(direction == 3){
			pos[0] = temp[4];
			pos[1] = temp[0];
			pos[2] = temp[2];
			pos[3] = temp[3];
			pos[4] = temp[5];
			pos[5] = temp[1];
		}
		return pos;
	}

	public boolean compare(int[] n1,int[] n2){		//???????????????????????§??????????????????
		if(n1[0] == n2[0] && n1[1] == n2[1] && n1[2] == n2[2]
				&& n1[3] == n2[3] && n1[4] == n2[4] && n1[5] == n2[5]){
			return true;
		}
		else{
			return false;
		}
	}
}