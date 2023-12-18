import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int[] val=new int[n];
			for(int i=0;i<n;i++){
				val[i]=sc.nextInt();
			}

			int max=-1000000000;
			for(int s=0;s<n;s++){
				int sum=0;
				for(int e=s;e<n;e++){
					sum+=val[e];
					if(sum>max){
						max=sum;
					}
				}
			}
			ln(max);
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