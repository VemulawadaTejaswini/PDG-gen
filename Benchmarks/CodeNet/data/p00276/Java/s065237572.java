import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 0;i < num;i++){
			int c = in.nextInt();
			int a = in.nextInt();
			int n = in.nextInt();
			int cnt = 0;
			while(true){
				if(c > 0 && a > 0 && n > 0){
					c--;a--;n--;cnt++;
				}else if(c > 1 && a > 0){
					c-=2;a--;cnt++;
				}else if(c > 2){
					c-=3;cnt++;
				}else break;
			}
			System.out.println(cnt);
		}
	}
}