import java.util.*;

//素数探索系 cf p0009
//素数を各々取得するのでArrayListでデータを取得するのがよい。
//データを挿入する時には、LinkedListの方が早いので途中でコピーするのもあり。

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			double n=sc.nextDouble();
			double sum=n;
			for(int i=2;i<=10;i++){
				if(i%2==0){
					n*=2;
				}else{
					n/=3;
				}
				sum+=n;
			}
			ln(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}