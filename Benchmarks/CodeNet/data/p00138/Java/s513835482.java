import java.util.*;
public class Main {
	static senshu[][] list = new senshu[3][8];
	static senshu[] sani = new senshu[18];
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int s=0;s<3;s++)for(int k=0;k<8;k++){
			int ban = in.nextInt();
			double time = in.nextDouble();
			list[s][k]=new senshu(ban,time);
		}
		for(int i=0;i<3;i++)Arrays.sort(list[i]);
		int cnt = 0;
		for(int i=0;i<3;i++){
			System.out.println(list[i][7].ban+" "+list[i][7].time);
			System.out.println(list[i][6].ban+" "+list[i][6].time);
			for(int s=5;s>=0;s--){
				sani[cnt]=list[i][s];
				cnt++;
			}
		}
		Arrays.sort(sani);
		System.out.println(sani[sani.length-1].ban+" "+sani[sani.length-1].time);
		System.out.println(sani[sani.length-2].ban+" "+sani[sani.length-2].time);
	}
}

class senshu implements Comparable<senshu>{
	int ban;
	double time;
	senshu(int ban,double time){
		this.ban=ban;
		this.time=time;
	}
	public int compareTo(senshu o) {
		if(o.time<this.time)return -1;
		else if(o.time>this.time)return 1;
		else return 0;
	}
}