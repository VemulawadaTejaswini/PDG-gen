import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		int cnt = 1;
		for(int i = 0; i < n;i++){
				int l = sc.nextInt();
				sum += l;
				if(sum<=x){
				cnt += 1;
			}
		}
		System.out.print(cnt);
	}
}
