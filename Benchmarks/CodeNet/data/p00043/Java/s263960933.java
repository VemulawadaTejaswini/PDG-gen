import java.util.Scanner;
import java.util.Arrays;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		int num;
		int[] count = new int[9];
		int[] ans = new int[10];
		int anscnt;
		while(sc.hasNext()){
			s = sc.next();
			anscnt = 0;
			//ÇÌª½Â é©²×é
			Arrays.fill(count, 0);
			for(int i = 0; i < 13; i++){
				count[ s.charAt(i) - '1']++;
			}

			for(int i = 0; i < 9; i++){
				if(count[i] < 4){
					count[i]++;
					if(check(count, 14)){
						ans[anscnt++] = i + 1;
					}
					count[i]--;
				}
			}
			if(anscnt == 0){
				System.out.println(0);
			}else{
				System.out.print(ans[0]);
				for(int i = 1; i < anscnt; i++){
					System.out.print(" " + ans[i]);
				}
				System.out.println();
			}
		}
	}
	public static boolean check(int[] count, int nokori){
		if(nokori == 2){
			for(int i = 0; i < 9; i++){
				if(count[i] >= 2){
					return true;
				}
			}
			return false;
		}

		for(int i = 0; i < 9; i++){
			if(count[i] >= 3){
				count[i] -= 3;
				if(check(count, nokori - 3)){

					count[i] += 3;
					return true;
				}
				count[i] += 3;
			}
		}
		for(int i = 0; i < 7; i++){
			if(count[i] >= 1 && count[i + 1] >= 1 && count[i + 2] >= 1){
				count[i]--;
				count[i + 1]--;
				count[i + 2]--;
				if(check(count, nokori - 3)){
					count[i]++;
					count[i + 1]++;
					count[i + 2]++;
					return true;
				}
				count[i]++;
				count[i + 1]++;
				count[i + 2]++;
				
			}
		}
		return false;
	}
}