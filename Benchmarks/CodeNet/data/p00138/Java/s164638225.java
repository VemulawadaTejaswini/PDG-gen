
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static void doit(){
		Scanner scan = new Scanner(System.in);
		Player player[]=new Player[24];
		Player[] f_player=new Player[8];
		Player[] memo=new Player[6];
		for(int i=0;i<24;i++){
			player[i]=new Player(scan.nextInt(),scan.nextDouble());
		}
		Arrays.sort(player,0,8);
		Arrays.sort(player,8,16);
		Arrays.sort(player,16,24);
		int k=0;
		for(int i=0;i<=16;i+=8){
			f_player[k]=player[i];
			f_player[k+1]=player[i+1];
			memo[k]=player[i+2];
			memo[k+1]=player[i+3];
			k+=2;
		}
		Arrays.sort(memo);
		f_player[6]=memo[0];
		f_player[7]=memo[1];
		for(int i=0;i<f_player.length;i++){
			System.out.printf("%d %.2f\n", f_player[i].num,f_player[i].time);
		}
	}
	public static void main(String[] args) {
		new Main().doit();
	}

}
class Player implements Comparable<Player>{
	int num;
	Double time;
	public Player(int num,Double time){
		this.num=num;
		this.time=time;
	}
	@Override
	public int compareTo(Player p){
		return time.compareTo(p.time);
	}	
}