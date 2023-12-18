import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[6];
		int[] b = new int[6];
		for(int i=0; i<6; i++){
			a[i] = scan.nextInt();
		}
		for(int i=0; i<6; i++){
			b[i] = scan.nextInt();
		}
		Dice xai1 = new Dice(a);
		Dice xai2 = new Dice(b);
		System.out.println(xai2.cheakSameDice(xai1, xai2));
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

	public String cheakSameDice(Dice xai1, Dice xai2){
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				xai2.roll('N');
				if(checkSurface(xai1, xai2))return "Yes";
				xai2.roll('W');
				if(checkSurface(xai1, xai2))return "Yes";
			}
			xai2.rotation();
			if(checkSurface(xai1, xai2))return "Yes";
		}
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				xai2.roll('N');
				if(checkSurface(xai1, xai2))return "Yes";
				xai2.roll('E');
				if(checkSurface(xai1, xai2))return "Yes";
			}
			xai2.rotation();
			if(checkSurface(xai1, xai2))return "Yes";
		}
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				xai2.roll('S');
				if(checkSurface(xai1, xai2))return "Yes";
				xai2.roll('W');
				if(checkSurface(xai1, xai2))return "Yes";
			}
			xai2.rotation();
			if(checkSurface(xai1, xai2))return "Yes";
		}
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				xai2.roll('S');
				if(checkSurface(xai1, xai2))return "Yes";
				xai2.roll('E');
				if(checkSurface(xai1, xai2))return "Yes";
			}
			xai2.rotation();
			if(checkSurface(xai1, xai2))return "Yes";
		}
		return "No";
	}

	public boolean checkSurface(Dice xai1, Dice xai2){
		if(xai1.dice[0]==xai2.dice[0] && xai1.dice[1]==xai2.dice[1] && xai1.dice[2]==xai2.dice[2] && xai1.dice[3]==xai2.dice[3] && xai1.dice[4]==xai2.dice[4] && xai1.dice[5]==xai2.dice[5]){
			return true;
		}
		return false;
	}

	public int showTop(){
		return dice[0];
	}
}