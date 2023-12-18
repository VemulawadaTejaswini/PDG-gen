import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[6];
		for(int i=0; i<6; i++){
			arr[i] = scan.nextInt();
		}
		Dice xai = new Dice(arr);
		int n = scan.nextInt();
		for(int i=0; i<n; i++){
			System.out.println(xai.showRightSide(scan.nextInt(), scan.nextInt()));
		}
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
	public int showTop(){
		return dice[0];
	}
	public int showRightSide(int top, int front){
		if(top == dice[0]){
			if(front==dice[1])return dice[2];
			if(front==dice[2])return dice[4];
			if(front==dice[3])return dice[1];
			if(front==dice[4])return dice[3];
		}
		else if(top == dice[1]){
			if(front==dice[0])return dice[3];
			if(front==dice[2])return dice[0];
			if(front==dice[3])return dice[5];
			if(front==dice[5])return dice[2];
		}
		else if(top == dice[2]){
			if(front==dice[0])return dice[1];
			if(front==dice[1])return dice[5];
			if(front==dice[4])return dice[0];
			if(front==dice[5])return dice[4];
		}
		else if(top == dice[3]){
			if(front==dice[0])return dice[4];
			if(front==dice[1])return dice[0];
			if(front==dice[4])return dice[5];
			if(front==dice[5])return dice[1];
		}
		else if(top == dice[4]){
			if(front==dice[0])return dice[2];
			if(front==dice[2])return dice[5];
			if(front==dice[3])return dice[0];
			if(front==dice[5])return dice[3];
		}
		else if(top == dice[5]){
			if(front==dice[1])return dice[3];
			if(front==dice[2])return dice[1];
			if(front==dice[3])return dice[4];
			if(front==dice[4])return dice[2];
		}
		return 0;
	}
}