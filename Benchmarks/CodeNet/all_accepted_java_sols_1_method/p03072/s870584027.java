import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] m = new int[N];
		for(int i = 0; i <N;i++) {
			m[i] = sc.nextInt();
		}
		int cnt = 1,num = 1;
		for(int j = 0;j<N-1;j++) {
			for(int i = 0; i < num+1;i++) {
				if(m[i] > m[num]) {
					break;
				}else if(i == num-1){
					cnt++;
				}
			}
			num++;
		}
		System.out.println(cnt);
	}
}