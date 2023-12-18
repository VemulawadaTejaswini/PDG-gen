public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//nでデータの入力個数を決める
		int count = 0;
		for(int i=0;i<n;i++) {
			
			//発車時刻
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			//到着時刻
			int H = sc.nextInt();
			int M = sc.nextInt();
			int S = sc.nextInt();

			int a,b;//aは発車時間を秒に、bは到着時間を秒に変換
			a= h*60*60 + m*60 + s;
			b= H*60*60 + M*60 + S;

			if(b-a>60) count++;
			if(a>b) break;
			if(n==0) break;


		}
		System.out.println(count);
	}
}
