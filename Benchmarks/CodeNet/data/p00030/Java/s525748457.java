import java.util.Scanner;

public class Main {

	static int n, s;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			s = cin.nextInt();
			n = cin.nextInt();
			if(s+n==0){
				break;
			}
			System.out.println(saiki(0,0,-1));
		}
	}
	static int saiki(int hukasa, int sum, int before){
		int res = 0;
		if(hukasa==s){
			if(sum == n){
				return 1;
			}
			else{
				return 0;
			}
		}
		for(int i = before+1; i < 10; i++){
			res += saiki(hukasa+1, sum+i, i);
		}
		return res;
	}
}