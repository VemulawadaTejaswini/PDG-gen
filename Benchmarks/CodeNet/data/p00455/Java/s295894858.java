import java.util.*;
import java.util.regex.Pattern;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			int start = getS(sc.nextInt(), sc.nextInt(), sc.nextInt());
			int end = getS(sc.nextInt(), sc.nextInt(), sc.nextInt());
			int rawtime = end - start;
			int [] time = getT(rawtime);
			System.out.println(time[0] + " " + time[1] + " " + time[2]);
		}
	}
	private int [] getT(int rawtime) {
		int [] res = new int[3];
		res[0] = rawtime / 60 / 60;
		res[1] = (rawtime % 3600) / 60;
		res[2] = rawtime % 60;
		return res;
	}
	private int getS(int h, int m, int s){
		int res = h * 60 * 60 + m * 60 + s;
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}