import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int k = scan.nextInt();
			if(n == 0 && k == 0){
				break;
			}
			boolean[] card = new boolean[n];
			boolean zero = false;
			int t = 0;
			for(int i = 0;i < k;i++){
				t = scan.nextInt();
				if(t == 0){
					zero = true;
					continue;
				}
				card[t-1] = true;
			}
			int max = 0;
			int flag = 0;
			for(int i = 0;i < n;i++){
				if(!card[i]){
					continue;
				}
				t = 1;
				flag = 0;
				for(int j = 1;i+j < n && ((!zero && flag < 1) || (zero && flag < 2));j++){
					t++;
					if(!card[i+j]){
						flag++;
					}
				}
				if(zero && flag > 0){
					flag -= 1;
				}
				max = Math.max(max,t-flag);
			}
			max = Math.max(max,t);
			System.out.println(max);
		}
	}
}