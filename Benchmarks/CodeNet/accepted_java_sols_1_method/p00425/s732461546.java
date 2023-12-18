import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int[] dice;
		String str;
		int tmp, ans;
		while((n = sc.nextInt()) != 0){
			dice = new int[]{1, 2, 3, 4, 5, 6};
			ans = 1;
			for(int i = 0; i < n; i++){
				str = sc.next();
				if(str.equals("North")){
					tmp = dice[0];
					dice[0] = dice[1];
					dice[1] = dice[5];
					dice[5] = dice[4];
					dice[4] = tmp;
				}else if(str.equals("East")){
					tmp = dice[0];
					dice[0] = dice[3];
					dice[3] = dice[5];
					dice[5] = dice[2];
					dice[2] = tmp;	
				}else if(str.equals("West")){
					tmp = dice[0];
					dice[0] = dice[2];
					dice[2] = dice[5];
					dice[5] = dice[3];
					dice[3] = tmp;	
				}else if(str.equals("South")){
					tmp = dice[0];
					dice[0] = dice[4];
					dice[4] = dice[5];
					dice[5] = dice[1];
					dice[1] = tmp;	
				}else if(str.equals("Right")){
					tmp = dice[1];
					dice[1] = dice[2];
					dice[2] = dice[4];
					dice[4] = dice[3];
					dice[3] = tmp;	
				}else{
					tmp = dice[1];
					dice[1] = dice[3];
					dice[3] = dice[4];
					dice[4] = dice[2];
					dice[2] = tmp;	
				}
				ans += dice[0];
			}
			System.out.println(ans);
		}
	}
}