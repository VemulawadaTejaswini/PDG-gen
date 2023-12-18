import java.util.Arrays;
import java.util.Scanner;

//Everlasting...?
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int N = 1000001;
		boolean[] p = new boolean[N];
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		int[] sum = new int[N];
		int[] maxp = new int[N];
		for(int i=2;i<N;i++){
			sum[i] = sum[i-1];
			maxp[i] = maxp[i-1];
			if(p[i]){
				maxp[i]=i;
				sum[i]+=i;
				for(int j=i+i;j<N;j+=i)p[j]=false;
			}
		}
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a|b)==0)break;
			int pa = maxp[a];
			int pb = maxp[b];
			System.out.println(pa-sum[pa-1]>pb-sum[pb-1]?"a":"b");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}