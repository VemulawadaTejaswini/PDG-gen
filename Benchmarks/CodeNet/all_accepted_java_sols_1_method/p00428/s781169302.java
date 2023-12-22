import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			int m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int[] count = new int[m];
			for(int i = 0;i < n*m;i++){
				if(scan.nextInt() == 1){
					count[i%m]++;
				}
			}
			int r = m-1;
			int[] rank = new int[m];
			boolean flag = true;
			int mflag = 0;
			while(flag){
				for(int i = m-1;i >= 0;i--){
					count[i]--;
					if(count[i] == 0){
						rank[r] = i+1;
						r--;
						mflag++;
					}
				}
				if(mflag == m){
					flag = false;
				}
			}
			for(int i = 0;i < m;i++){
				if(i != m-1){
					System.out.print(rank[i]+" ");
				}else{
					System.out.println(rank[i]);
				}
			}
		}
	}
}