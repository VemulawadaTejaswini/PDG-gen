import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dice {
	
	int[] dice = new int[6];
	int tmp;
	String[] num;
	
	public Dice(String s){
		num = s.split(" ");
		for(int i = 0 ; i < dice.length ; i++){
			dice[i] = Integer.parseInt(num[i]) ;
		}
	}
	
	int e(int n){
		tmp = dice[0];
		dice[0] = dice[3] ;
		dice[3] = dice[5] ;
		dice[5] = dice[2];
		dice[2] = tmp;
		return dice[n];
	}
	
	int n(int n){
		tmp = dice[0];
		dice[0] = dice[1] ;
		dice[1] = dice[5] ;
		dice[5] = dice[4];
		dice[4] = tmp;
		return dice[n];
	}
	
	int s(int n){
		tmp = dice[0];
		dice[0] = dice[4] ;
		dice[4] = dice[5] ;
		dice[5] = dice[1];
		dice[1] = tmp;
		return dice[n];
	}
	
	int w(int n){
		tmp = dice[0];
		dice[0] = dice[2] ;
		dice[2] = dice[5] ;
		dice[5] = dice[3];
		dice[3] = tmp;
		return dice[n];
	}

}

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = 0 ;
		String num = input.readLine();
		Dice dice = new Dice(num);
		String com = input.readLine();
		for(int i = 0 ; i < com.length() ; i ++){
		if(com.charAt(i) == 'E') n = dice.e(0);
		if(com.charAt(i) == 'N') n = dice.n(0);
		if(com.charAt(i) == 'S') n = dice.s(0);
		if(com.charAt(i) == 'W') n = dice.w(0);
		}
		
		System.out.println(n);
		
	}
}