import java.util.Scanner;

//Surf Smelt Fishing Contest II
public class Main{

	int N = 1<<21;
	int[] num, id;
	
	void update(int i){
		if(i <= 0)return;
		int L = 2*i+1, R = 2*i+2;
		if(num[L]==num[R]){
			num[i] = num[L];
			id[i] = id[L];
		}
		else if(num[L] < num[R]){
			num[i] = num[R];
			id[i] = id[R];
		}
		else{
			num[i] = num[L];
			id[i] = id[L];
		}
		update(i>>1);
	}
	
	void run(){
		num = new int[N+1];
		id = new int[N+1];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), Q = sc.nextInt();
		for(int i=0;i<n;i++){
			id[n+i] = i+1;
			update((n+i)>>1);
		}
		while(Q--!=0){
			int a = sc.nextInt()-1, v = sc.nextInt();
			num[n+a]+=v;
			update((n+1)>>1);
			System.out.println(id[1]+" "+num[1]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}