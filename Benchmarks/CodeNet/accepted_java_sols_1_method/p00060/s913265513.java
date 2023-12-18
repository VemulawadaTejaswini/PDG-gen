import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			boolean[] card = new boolean[11];
			int my1 = stdIn.nextInt();
			int my2 = stdIn.nextInt();
			int your = stdIn.nextInt();
			card[my1] = true;
			card[my2] = true;
			card[your] = true;
			int  zan = 20-my1-my2;
			int cnt = 0;
			for(int i=1;i<=10;i++){
				if(!card[i]&&zan>=i){
					cnt++;
				}
			}
			System.out.println(cnt>3?"YES":"NO");
		}
	}
}