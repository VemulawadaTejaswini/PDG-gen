import java.util.*;

public class Main{
	void doIt(){
		Scanner sc = new Scanner(System.in);
		Runner[][] rdata = new Runner[4][];
		for(int i=0; i<3; ++i){
			rdata[i] = new Runner[8];
			for(int j=0; j<8; ++j){
				int a=sc.nextInt();
				Double d=sc.nextDouble();
				rdata[i][j] = new Runner(a,d);
			}	
		}
		
		for(int i=0; i<3; ++i){	
			Arrays.sort(rdata[i]);
		}
		rdata[3] = new Runner[6];
		for(int i=0,j=0; i<3; ++i){
			rdata[3][j++] = rdata[i][2];
			rdata[3][j++] = rdata[i][3];
		}
		Arrays.sort(rdata[3]);
		for(int i=0; i<4; ++i){
			System.out.println(rdata[i][0].toString());
			System.out.println(rdata[i][1].toString());
		}
	}
	public static void main(String args[]){
		new Main().doIt();
	}
	class Runner implements Comparable<Runner>{
		Double time;
		int num;
		Runner(int num, double time){
			this.num = num;
			this.time = time;
		}
		public void set(int num, Double time){
			this.num = num;
			this.time = time;
		}
		public String toString(){
			String str_time = String.format("%.2f", time);
			return num + " " + str_time;
		}
		public int compareTo(Runner o){
			return time.compareTo(o.time);
		}
	}
}