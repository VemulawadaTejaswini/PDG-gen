
import java.util.Scanner;

public class Main {
	static boolean[] acFlag;
	static int[] waAry;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		acFlag = new boolean[n];
		waAry = new int[n];
		int m = sc.nextInt();
		for(int i = 0; i < m; i++){
			int num = sc.nextInt() - 1;
			String s = sc.next();
			if(! acFlag[num]){
				if("AC".equals(s)){
					acFlag[num] = true;
				}else{
					waAry[num]++;
				}
			}
		}
		int acNum = 0;
		int waNum = 0;
		for(int i = 0; i < n; i++){
			if(acFlag[i]){
				acNum++;
				waNum += waAry[i];
			}
		}
		System.out.println(acNum + " " + waNum);
	}
}
