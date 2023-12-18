import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int num1[] = new int[6];
		int num2[] = new int[6];
		boolean yn = false;
//		String answer = "";
//		int decTime = 0;
//		int up = -1;
//		int frontBanti = 0;
		diceClass dice =new diceClass();

		for (int i=0;i<6;i++){
			num1[i] = scan.nextInt();
		}
		for (int i=0;i<6;i++){
			num2[i] = scan.nextInt();
			dice.pos[i] = num2[i];
		}
		int compareNum [] = num2.clone();

		for(int i=0;i<4;i++){
			for(int ii=0;ii<4;ii++){
				for(int iii=0;iii<4;iii++){
					yn = dice.compare(num1, compareNum);
					if(yn == true){
						break;
					}
					compareNum = dice.move(i);
					yn = dice.compare(num1, compareNum);
					if(yn == true){
						break;
					}
					compareNum = dice.move(ii);
					yn = dice.compare(num1, compareNum);
					if(yn == true){
						break;
					}
					compareNum = dice.move(iii);
					yn = dice.compare(num1, compareNum);
					if(yn == true){
						break;
					}
				}
			}
			if(yn == true){
				break;
			}
		}
		if(yn == true){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
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

	public int[] move(int direction){
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



//	public int rightNumber(int up,int ri){
//		int[] temp = new int[4];
//		int front = 0;
////		System.out.println("up "+up+"  "+"front "+ri);
//		if(up == 0){
//			temp = (int[])up0.clone();
//		}
//		else if(up == 1){
//			temp = (int[])up1.clone();
//		}
//		else if(up == 2){
//			temp = (int[])up2.clone();
//		}
//		else if(up == 3){
//			temp = (int[])up3.clone();
//		}
//		else if(up == 4){
//			temp = (int[])up4.clone();
//		}
//		else if(up == 5){
//			temp = (int[])up5.clone();
//		}
//		for(int i =0;i<4;i++){
////			System.out.println("compare "+temp[i]+" "+ri);
//			if(temp[i] == ri){
//				front = i+1;
//				if(front == 4){
//					front = 0;
//				}
//				break;
//			}
//		}
//		return temp[front];
//	}
	public boolean compare(int[] n1,int[] n2){
		if(n1[0] == n2[0] && n1[1] == n2[1] && n1[2] == n2[2]
				&& n1[3] == n2[3] && n1[4] == n2[4] && n1[5] == n2[5]){
			return true;
		}
		else{
			return false;
		}
	}
}