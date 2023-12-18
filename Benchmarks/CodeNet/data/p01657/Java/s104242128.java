import java.util.Scanner;

public class Main {
	int n, x, m;
	int[][] map;
	
	void print(int[] nn){
		String ans = "";
		for(int i=0;i<nn.length;i++){
			ans += nn[i] + " ";
		}
		System.out.println(ans.trim());
		System.exit(0);
	}
	
	boolean check(int[] nn){
		boolean[] ff = new boolean[nn.length];
		for(int i=0;i<m;i++){
			int sum = 0;
			for(int j=map[i][0]-1;j<map[i][1];j++){
				ff[j] = true;
				sum += nn[j];
			}
			if(sum!=map[i][2]) return false;
		}
		
		for(int i=0;i<nn.length;i++){
			if(!ff[i]) nn[i] = x;
		}
		print(nn);
		return true;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		m = sc.nextInt();
		map = new int[m][3];
		for(int i=0;i<m;i++){
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
			map[i][2] = sc.nextInt();
		}
		
		int[] nn = new int[n];
		for(int a=x;a>=0;a--){
			nn[0] = a;
			if(n==1){
				check(nn);
				continue;
			}
			for(int b=x;b>=0;b--){
				nn[1] = b;
				if(n==2){
					check(nn);
					continue;
				}
				for(int c=x;c>=0;c--){
					nn[2] = c;
					if(n==3){
						check(nn);
						continue;
					}
					for(int d=x;d>=0;d--){
						nn[3] = d;
						if(n==4){
							check(nn);
							continue;
						}
						for(int e=x;e>=0;e--){
							nn[4] = e;
							if(n==5){
								check(nn);
								continue;
							}
							for(int f=x;f>=0;f--){
								nn[5] = f;
								check(nn);
							}
						}
					}
				}
			}
		}
		System.out.println(-1);
	}
	
	public static void main(String[] args) {
		new	Main().run();
	}

	
}