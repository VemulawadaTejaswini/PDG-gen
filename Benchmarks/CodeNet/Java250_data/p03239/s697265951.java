import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int all = sc.nextInt();        //fre 次數
		int T = sc.nextInt();
		int route[] = new int[all];
		int time[] = new int[all];
		int min = 9999;
		for(int i = 0 ; i<all; i++) {
			route[i]=sc.nextInt();
			time[i]=sc.nextInt();
		}
		for(int i = 0 ; i<all;i++) {
			if(time[i]<=T) {
				if(route[i]<min) {
					min = route[i];
				}
			}
		}
		if(min!=9999) {
			System.out.println(min);
		}
		else {
			System.out.println("TLE");
		}
	}
}
