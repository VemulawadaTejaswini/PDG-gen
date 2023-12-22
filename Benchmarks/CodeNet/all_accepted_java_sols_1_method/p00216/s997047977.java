import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int prev = 4280;
		for(;;){
			int use = in.nextInt();
			if(use == -1) return ;
			int cur = 1150;
			cur += Math.min(Math.max(0, use-10),10)*125;
			cur += Math.min(Math.max(0, use-20), 10)*140;
			cur += Math.max(0, use-30)*160;
			System.out.println(prev - cur);
		}
	}

}