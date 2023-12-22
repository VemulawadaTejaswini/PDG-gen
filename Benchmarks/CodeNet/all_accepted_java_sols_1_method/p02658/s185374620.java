import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner scan =new Scanner(System.in);
	int N=scan.nextInt();
	long num[]=new long[N];
	long answer=1;
	long max =1000000000000000000L;
		for(int i=0;i<N;i++) {
			num[i]=scan.nextLong();
		}
		Arrays.sort(num);
		for(Long tmp:num) {
			if(tmp==0) {
				answer=0;
				break;
			}else if(tmp<=(max/answer)) {
				answer*=tmp;
			}else {
				answer =-1;
				break;
			}
		}
		System.out.println(answer);
	}
}
