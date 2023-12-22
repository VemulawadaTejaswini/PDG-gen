import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0;i < N;i++){
			a.add(sc.nextInt());
		}
		sc.close();
		long cnt = 0;
		int flg = 1;
		if(a.indexOf(1) == -1){
			System.out.println(-1);
			return;
		}else{
			cnt += a.indexOf(1);
			for(int i = a.indexOf(1);i < N-1;i++){
				if(a.get(i+1)==flg+1){
					flg++;
				}else{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}