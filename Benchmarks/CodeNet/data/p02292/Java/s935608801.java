import java.util.Scanner;

class Main{
	static String judge(int xp0, int yp0, int xp1, int yp1, int xp2, int yp2){
		double[] p1_to_p2 = {xp2 - xp1, yp2 - yp1};
		double aLine = (double)p1_to_p2[1] / (double)p1_to_p2[0];
		double[] p1 = {xp1 - xp0, yp1 - yp0};
		double[] p2 = {xp2 - xp0, yp2 - yp0};
		double[] p1plusp2 = {p1[0] + p2[0], p1[1] + p2[1]};
		boolean parallel;

		if(p1[0] != 0 && p1[1] != 0){
			if(p2[0] / p1[0] == p2[1] / p1[1]){
				parallel = true;
			}else{
				parallel = false;
			}
		}else{
			if(p1[0] == 0 && p2[0] == 0){
				parallel = true;
			}else if(p1[1] == 0 && p2[1] == 0){
				parallel = true;
			}else{
				parallel = false;
			}
		}

		if(parallel){ //parallel or p2=0
			if(p1[0] * p2[0] + p1[1] * p2[1] >= 0){ //naiseki_plus
				if(Math.abs(p2[0]*p2[0] + p2[1]*p2[1]) > Math.abs(p1[0]*p1[0] + p1[1]*p1[1])){
					return "ONLINE_FRONT";
				}else{
					return "ON_SEGMENT";
				}
			}else{
				return "ONLINE_BACK";
			}
		}else{//not parallel
			if(p1_to_p2[0] > 0){
				if(yp1 < aLine * xp1){
					return "COUNTER_CLOCKWISE";
				}else{
					return "CLOCKWISE";
				}
			}else if(p1_to_p2[0] == 0){
				if(p1_to_p2[1] > 0 && xp1 > 0){
					return "COUNTER_CLOCKWISE";
				}else if(p1_to_p2[1] > 0 && xp1 < 0){
					return "CLOCKWISE";
				}else if(p1_to_p2[1] < 0 && xp1 > 0){
					return "CLOCKWISE";
				}else if(p1_to_p2[1] < 0 && xp1 < 0){
					return "COUNTER_CLOCKWISE";
				}else{
					return "nulldesu";
				}
			}else{
				if(yp1 < aLine * xp1){
					return "CLOCKWISE";
				}else{
					return "COUNTER_CLOCKWISE";
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int xp0 = in.nextInt();
		int yp0 = in.nextInt();
		int xp1 = in.nextInt();
		int yp1 = in.nextInt();
		int q = in.nextInt();

		for(int i = 0; i < q; i ++){
			System.out.println(judge(xp0, yp0, xp1, yp1, in.nextInt(), in.nextInt()));
		}

	}
}