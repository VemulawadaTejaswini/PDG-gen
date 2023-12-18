import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] ps = new int[n];
		int[] hantei = new int[101];
		for(int i=0; i<n; i++){
			ps[i] = sc.nextInt();
			hantei[ps[i]] = 1;
		}
		int ans1 = 1000;
		for(int i=x; i<=100; i++){
			if(hantei[i] == 0){
				ans1 = i;
				break;
			}
		}
		int ans2 = 1000;
		for(int i=x; i>=-1; i--){
			if(i == 0) {
				ans2 = -1;
				break;
			}
			if(hantei[i] == 0){
				ans2 = i;
				break;
			}
		}
		if((ans1-x)<(x-ans2)){
			System.out.println(ans1);
		} else {
			System.out.println(ans2);
		}
	}
}
