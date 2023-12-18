import java.util.Arrays;
import java.util.Scanner;
class Player implements Comparable<Player>{
	int party;
	int num;
	String time;
	Player(int p,int n,String t){
		this.party = p;
		this.num = n;
		this.time = t;
	}
	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return this.time.compareTo(o.time);
	}	
}
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Player[] person = new Player[24];
		int[][] rank = new int[3][8];
		int[] cnt = new int[3]; 
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 8;j++){
				person[i*8+j] = new Player(i,sc.nextInt(),sc.next());
			}
		}
		Arrays.sort(person);
		for(int i = 0;i < 24;i++){
			rank[person[i].party][cnt[person[i].party]] = i;
			cnt[person[i].party]++;
		}
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 2;j++){
				System.out.println(person[rank[i][j]].num+" "+person[rank[i][j]].time);
				person[rank[i][j]].time = "999";
			}
		}
		Arrays.sort(person);
		for(int j = 0;j < 2;j++){
			System.out.println(person[j].num+" "+person[j].time);
		}	
	}
}