import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[6];
		for(int i=0; i<6; i++){
			arr[i] = scan.nextInt();
		}
		Dice xai = new Dice(arr);
		char[] dere = scan.next().toCharArray();
		for(char ch: dere){
			xai.roll(ch);
		}
		System.out.println(xai.showTop());
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
}