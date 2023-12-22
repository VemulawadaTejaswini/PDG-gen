import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[]  dice = new int[6];
			dice[0] = 1;
			dice[1] = 6;
			dice[2] = 4;
			dice[3] = 3;
			dice[4] = 2;
			dice[5] = 5;
			int sum = 1;
			String str;
			int t1 = 0;
			int t2 = 0;
			for(int i = 0;i < n;i++){
				str = scan.next();
				if(str.equals("North")){
					t1 = dice[5];
					dice[5] = dice[0];
					t2 = dice[1];
					dice[1] = t1;
					t1 = dice[4];
					dice[4] = t2;
					dice[0] = t1;
				}else if(str.equals("South")){
					t1 = dice[4];
					dice[4] = dice[0];
					t2 = dice[1];
					dice[1] = t1;
					t1 = dice[5];
					dice[5] = t2;
					dice[0] = t1;
				}else if(str.equals("East")){
					t1 = dice[3];
					dice[3] = dice[0];
					t2 = dice[1];
					dice[1] = t1;
					t1 = dice[2];
					dice[2] = t2;
					dice[0] = t1;
				}else if(str.equals("West")){
					t1 = dice[2];
					dice[2] = dice[0];
					t2 = dice[1];
					dice[1] = t1;
					t1 = dice[3];
					dice[3] = t2;
					dice[0] = t1;
				}else if(str.equals("Right")){
					t1 = dice[5];
					dice[5] = dice[2];
					t2 = dice[3];
					dice[3] = t1;
					t1 = dice[4];
					dice[4] = t2;
					dice[2] = t1;
				}else if(str.equals("Left")){
					t1 = dice[4];
					dice[4] = dice[2];
					t2 = dice[3];
					dice[3] = t1;
					t1 = dice[5];
					dice[5] = t2;
					dice[2] = t1;
				}
				sum += dice[0];
			}
			System.out.println(sum);
		}
	}
}