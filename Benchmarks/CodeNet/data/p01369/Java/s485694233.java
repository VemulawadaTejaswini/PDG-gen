import java.util.Scanner;

public class Main{

	boolean[] right = new boolean[0x100];

	void run(){
		right['y'] = true;
		right['u'] = true;
		right['i'] = true;
		right['o'] = true;
		right['p'] = true;
		right['h'] = true;
		right['j'] = true;
		right['k'] = true;
		right['l'] = true;
		right['n'] = true;
		right['m'] = true;


		Scanner in = new Scanner(System.in);
		for(;;){
			String line = in.nextLine();
			if(line.equals("#")) return ;
			System.out.println(solve(line));
		}
	}

	int solve(String str){
		int ret = 0;
		boolean isRight = right[str.charAt(0)];
		for(int i=1; i<str.length(); i++){
			if(isRight ^ right[str.charAt(i)]){
				ret++;
			}
			isRight = right[str.charAt(i)];
		}
		return ret;
	}

	public static void main(String[] args){
		new Main().run();
	}
}