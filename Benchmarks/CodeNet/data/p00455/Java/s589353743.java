import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		for(int i=0;i<3;i++){
			int come = Sec(stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt());
			int out = Sec(stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt());
			int ans[] = Work(out-come);
			System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
		}
	}
	static int Sec(int h, int m, int s){
		return h*60*60+m*60+s;
	}
	static int[] Work(int sec){
		int ret[] = new int[3];
		ret[0] = sec/3600;
		ret[1] = (sec%3600)/60;
		ret[2] = sec%60;
		return ret;
	}
}