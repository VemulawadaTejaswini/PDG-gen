
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		player playersArray[][]=new player[3][8];
		player threeArray[]=new player[3];
		for(int i=0;i<3;i++){
			for(int j=0;j<8;j++){
				playersArray[i][j]=new player(sc.nextInt(),sc.nextDouble());
			}
		}
		for(int i=0;i<3;i++){
			Arrays.sort(playersArray[i]);
		}
		for(int i=0;i<3;i++){
			threeArray[i]=playersArray[i][2];
		}
		Arrays.sort(threeArray);
		
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.println(playersArray[i][j].number+" "+playersArray[i][j].time);
			}
		}
		System.out.println(threeArray[0].number+" "+threeArray[0].time);
		System.out.println(threeArray[1].number+" "+threeArray[1].time);
	}
	static class player implements Comparable<player>{
		int number;
		double time;
		player(int number,double time){
			this.number=number;
			this.time=time;
		}
		@Override
		public int compareTo(player obj){
			if(this.time<obj.time)return -1; //自分よりもobjが大きければ-1
			if(this.time>obj.time)return 1;//自分よりもobjが小さければ1
			return 0;//自分と同じならば0
		}
	}

}