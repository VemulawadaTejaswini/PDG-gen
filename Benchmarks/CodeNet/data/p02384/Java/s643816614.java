import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int num[] = new int[6];
		int answer = -1;
		int decTime = 0;
//		int up = -1;
		int frontBanti = -1;
		diceClass dice =new diceClass();
		for (int i=0;i<6;i++){
			num[i] = scan.nextInt();
			dice.pos[i] = num[i];
		}
		decTime = scan.nextInt();
		int upSide[] = new int[decTime];
		int frontSide[] = new int[decTime];
		for(int i=0;i<decTime;i++){

			upSide[i] = scan.nextInt();
			frontSide[i] = scan.nextInt();
			for(int ii=0;ii<6;ii++){
				if(frontSide[i] == num[ii]){
					frontBanti = ii;
					break;
				}
			}
			for(int ii=0;ii<6;ii++){
				if(upSide[i] == num[ii]){
					answer = dice.rightNumber(ii,frontBanti);
					System.out.println(num[answer]);
					break;
				}
			}
		}
	}
}
class diceClass{	//?????????????????¢?????????????????´?????????
	int pos[] = new int[6];
	int up0[] = {1,2,4,3};
	int up1[] = {0,3,5,2};
	int up2[] = {0,1,5,4};
	int up3[] = {0,4,5,1};
	int up4[] = {0,2,5,3};
	int up5[] = {1,3,4,2};

	public diceClass(){

	}

//	public int move(char direction){
//		int[] temp = (int[])pos.clone();
//		if(direction == 'N'){
//			pos[0] = temp[1];
//			pos[1] = temp[5];
//			pos[2] = temp[2];
//			pos[3] = temp[3];
//			pos[4] = temp[0];
//			pos[5] = temp[4];
//		}
//		else if(direction == 'E'){
//			pos[0] = temp[3];
//			pos[1] = temp[1];
//			pos[2] = temp[0];
//			pos[3] = temp[5];
//			pos[4] = temp[4];
//			pos[5] = temp[2];
//		}
//		else if(direction == 'W'){
//			pos[0] = temp[2];
//			pos[1] = temp[1];
//			pos[2] = temp[5];
//			pos[3] = temp[0];
//			pos[4] = temp[4];
//			pos[5] = temp[3];
//		}
//		else if(direction == 'S'){
//			pos[0] = temp[4];
//			pos[1] = temp[0];
//			pos[2] = temp[2];
//			pos[3] = temp[3];
//			pos[4] = temp[5];
//			pos[5] = temp[1];
//		}
//		return pos[0];
//	}
	public int rightNumber(int up,int ri){
		int[] temp = new int[4];
		int front = -1;
//		System.out.println("up "+up+"  "+"front "+ri);
		if(up == 0){
			temp = (int[])up0.clone();
		}
		else if(up == 1){
			temp = (int[])up1.clone();
		}
		else if(up == 2){
			temp = (int[])up2.clone();
		}
		else if(up == 3){
			temp = (int[])up3.clone();
		}
		else if(up == 4){
			temp = (int[])up4.clone();
		}
		else if(up == 5){
			temp = (int[])up5.clone();
		}
		for(int i =0;i<4;i++){
//			System.out.println("compare "+temp[i]+" "+ri);
			if(temp[i] == ri){
				front = i+1;
				if(front == 4){
					i = 0;
				}
				break;
			}
		}
		return temp[front];
	}
}