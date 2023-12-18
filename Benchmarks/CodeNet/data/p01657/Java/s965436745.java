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
		for(int i=0;i<m;i++){
			int sum = 0;
			for(int j=map[i][0]-1;j<map[i][1];j++){
				sum += nn[j];
			}
			if(sum!=map[i][2]) return false;
		}
		
		return true;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][3];
		for(int i=0;i<m;i++){
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
			map[i][2] = sc.nextInt();
		}
		
		int[] nn = new int[n];
		for(int a=0;a<=x;a++){
			nn[0] = a;
			if(n==1){
				if(check(nn)) print(nn);
				continue;
			}
			for(int b=0;b<=x;b++){
				nn[1] = b;
				if(n==2){
					if(check(nn)) print(nn);
					continue;
				}
				for(int c=0;c<=x;c++){
					nn[2] = c;
					if(n==3){
						if(check(nn)) print(nn);
						continue;
					}
					for(int d=0;d<=x;d++){
						nn[3] = d;
						if(n==4){
							if(check(nn)) print(nn);
							continue;
						}
						for(int e=0;e<=x;e++){
							nn[4] = e;
							if(n==5){
								if(check(nn)) print(nn);
								continue;
							}
							for(int f=0;f<=x;f++){
								nn[5] = f;
								if(check(nn)) print(nn);
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