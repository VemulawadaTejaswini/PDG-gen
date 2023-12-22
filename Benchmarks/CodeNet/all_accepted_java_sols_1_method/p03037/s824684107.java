import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sita = 1;
		int ue = n;
		for(int i = 0; i < m; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			sita = Math.max(sita,l);
			ue = Math.min(ue,r);
		}
		System.out.print(Math.max(ue-sita+1,0));
	}
}
