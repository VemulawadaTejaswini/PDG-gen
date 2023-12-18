import java.lang.reflect.Array;
import java.util.*;


public class Main {
    race[] raceArray = new race[8];
    race[] raceArrays = new race[6];
    
	void doIt(){
		String a, b;
		int p = 0;
		Scanner sc = new Scanner(System.in);
		for(int m = 0; m < 3; m++){
			for(int i = 0; i < 8; i++){
				a = sc.next();
				b = sc.next();
				raceArray[i] = new race(a,b);
			}
			Arrays.sort(raceArray);
			for(int k = 0; k < 2; k++){
				System.out.println(raceArray[k].number + " " + raceArray[k].time);
			}
			for(int l = 2; l < 4; l++){
				raceArrays[p] = raceArray[l];
				p = p + 1;
			}
		}
		Arrays.sort(raceArrays);
		for(int i = 0; i < 2; i++){
			System.out.println(raceArrays[i].number + " " + raceArrays[i].time);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
	class race implements Comparable<race>{
		String number;
		String time;
		race(String racenum, String racetime){
			this.number = racenum;
			this.time = racetime;
		}
		@Override
		public int compareTo(race p){
			return time.compareTo(p.time);
		}

	}

}