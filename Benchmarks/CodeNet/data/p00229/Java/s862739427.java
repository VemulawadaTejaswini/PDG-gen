import java.util.Scanner;

class Main {
	public static void main(String[] args){
		int[] num = new int[6];
		Scanner sc = new Scanner(System.in);
		int count;
		Slot s;
		
		while(true){
			count = 0;
			for(int i=0;i<6;i++){
				num[i] = sc.nextInt();
				count += num[i];
			}
			
			if(count == 0){
				break;
			}
			
			s = new Slot(num);
			System.out.println(s.getCoin());
		}
	}
}

class Slot{
	int[] gameResult;
	int coin;
	
	Slot(int[] num){
		gameResult = num;
		coin = 100;
	}
	
	private void reflectResult(){
		coin += 15*6*gameResult[0];
		coin += 15*4*gameResult[1];
		coin += 7*gameResult[2];
		coin += 2*gameResult[3];
		coin -= (3*(gameResult[5]-gameResult[4])-5*gameResult[0]-3*gameResult[1]);
	}
	
	public int getCoin(){
		reflectResult();
		return coin;
	}
}