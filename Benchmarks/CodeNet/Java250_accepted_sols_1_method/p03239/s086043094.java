import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limitC = sc.nextInt();
		int limitT = sc.nextInt();
		int[][] routeOption = new int[2][1000];
		int ans = 1010;
		while(sc.hasNext() == true){
			int optionC = sc.nextInt();
			int optionT = sc.nextInt();
			if(optionT <= limitT){
				ans = Math.min(ans, optionC);
			}
		}
		if(ans == 1010){
			System.out.println("TLE");
		}else{
			System.out.println(ans);
		}
	}

}
