import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] card = new int[2*n];
			for(int i = 0;i < n;i++){
				card[scan.nextInt()-1] = 1;
			}
			int[] count = {n,n};
			int now = 1;
			boolean sw = true;
			while(sw){
				for(int i = 0;i < 2*n;i++){
					if(card[i] == now){
						card[i] = -1;
						count[now]--;
						now ^= 1;
					}
					if(count[0] == 0 || count[1] == 0){
						sw = false;
						break;
					}
				}
				now ^= 1;
			}
			count[0] = 0;
			count[1] = 0;
			for(int i = 0;i < 2*n;i++){
				if(card[i] < 0){
					continue;
				}
				count[card[i]]++;
			}
			System.out.println(count[0] + "\n" + count[1]);
		}
	}
}