import java.util.*;
 
class Main{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Dice[] xai = new Dice[n];
		for(int i=0; i<n; i++){
			int[] a = new int[6];
			for(int j=0; j<6; j++){
				a[j] = scan.nextInt();
			}
			xai[i] = new Dice(a);
		}

		//??\??????????????????????????????????????°????????´??? "Yes"??????????????????????????\?????????????????´??? "No"?????????
		String ans = "Yes";
		for(int i=0; i<n-1; i++){
			for(int j=1; j<n; j++){
				if(i==j)continue;
				if(xai[i].checkTwoDices(xai[i], xai[j])){
					ans = "No"; //true???????????§????????£????????????No????????????
				}
			}
		}
		System.out.println(ans);
    }
}

class Dice{
	int[] dice;
	public Dice(int[] a){
		dice = new int[6];
		for(int i=0; i<6; i++){
			dice[i] = a[i];
		}
	}
	public void roll(char c){
		int tmp = 0;
		switch(c){
			case 'N':
				tmp = dice[0];
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = tmp;
				break;
			case 'W':
				tmp = dice[0];
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = tmp;
				break;
			case 'S':
				tmp = dice[0];
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = tmp;
				break;
			case 'E':
				tmp = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = tmp;
				break;
		}
	}
	public void rotation(){ //???????????????????¨???????????????????
		int tmp = dice[1];
		dice[1] = dice[2];
		dice[2] = dice[4];
		dice[4] = dice[3];
		dice[3] = tmp;
	}

	public boolean checkTwoDices(Dice xai1, Dice xai2){
		if(compareDices(xai1, xai2, 'N', 'W'))return true;
		if(compareDices(xai1, xai2, 'N', 'E'))return true;
		if(compareDices(xai1, xai2, 'S', 'W'))return true;
		if(compareDices(xai1, xai2, 'S', 'E'))return true;
		return false;
	}

	public boolean checkSurface(Dice xai1, Dice xai2){
		if(xai1.dice[0]==xai2.dice[0] && xai1.dice[1]==xai2.dice[1] && xai1.dice[2]==xai2.dice[2] && xai1.dice[3]==xai2.dice[3] && xai1.dice[4]==xai2.dice[4] && xai1.dice[5]==xai2.dice[5]){
			return true;
		}
		return false;
	}

	public boolean compareDices(Dice xai1, Dice xai2, char c1, char c2){
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				xai2.roll(c1);
				if(checkSurface(xai1, xai2))return true;
				xai2.roll(c2);
				if(checkSurface(xai1, xai2))return true;;
			}
			xai2.rotation();
			if(checkSurface(xai1, xai2))return true;
		}
		return false;
	}

	public int showTop(){
		return dice[0];
	}
}