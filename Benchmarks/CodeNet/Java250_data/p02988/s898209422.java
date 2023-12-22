import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0; i<n; i++){
			p[i] = sc.nextInt();
		}

		int cnt = 0;
		int flg = 0;
		if(p[0]>p[1]){
			flg = 0;
		}else{
			flg = 1;
		}
		for(int i=1;i<n-1;i++){
			if(flg==0 && p[i]>p[i+1]){
				cnt += 1;
				flg = 0;
			}else if(flg==0 && p[i]<p[i+1]){
				flg=1;
			}else if(flg==1 && p[i]>p[i+1]){
				flg=0;
			}else if(flg==1 && p[i]<p[i+1]){
				cnt +=1;
				flg = 1;
			}
		}
		System.out.println(cnt);

	}

}
