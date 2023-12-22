//Volume2-0205
import java.util.Scanner;

class Main {

	private static int[] cnt,
             		     player,
		                 result;

	public static void main(String[] args){
		int   victory,loss;

		Scanner sc = new Scanner(System.in);

		while(true){
			cnt    = new int[4];
			player = new int[5];
			result = new int[5];
			player[0] = sc.nextInt();
			if(player[0] == 0){break;}
			cnt[player[0]]++;
			for(int i=1;i<5;i++){
				player[i] = sc.nextInt();
				cnt[player[i]]++;
			}
			scape : {
				if(cnt[1] == 5 || cnt[2] == 5 || cnt[3] == 5 ||
				  (cnt[1] != 0 && cnt[2] != 0 && cnt[3] != 0    )){
					for(int j=0;j<5;j++){result[j] = 3;}
					break scape;
				}
				victory = 0; loss = 0;
				if       (cnt[1] != 0 && cnt[2] != 0){
					victory = 1;
					loss    = 2;
				} else if(cnt[2] != 0 && cnt[3] != 0){
					victory = 2;
					loss    = 3;
				} else if(cnt[1] != 0 && cnt[3] != 0){
					victory = 3;
					loss    = 1;
				}
				for(int j=0;j<5;j++){
					if        (player[j] == victory){
						result[j] = 1;
					} else if (player[j] == loss){
						result[j] = 2;
					}
				}
			}
			for(int i:result){System.out.println(i);}
		}
	}
}