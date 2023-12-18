import java.util.*;

public class Main {
	int n, cnt;
	int[][] c;
	
	void up(int m){
		int tmp = c[m][0];
		c[m][0] = c[m][1];
		c[m][1] = c[m][5];
		c[m][5] = c[m][4];
		c[m][4] = tmp;
	}
	
	void right(int m){
		int tmp = c[m][1];
		c[m][1] = c[m][3];
		c[m][3] = c[m][4];
		c[m][4] = c[m][2];
		c[m][2] = tmp;
	}
	
	boolean check(int m){
		for(int i=m-1;i>=0;i--){
			int cc = 0;
			for(int j=0;j<6;j++) if(c[i][j]==c[m][j]) cc++;
			if(cc==6) return true;
		}
		return false;
	}
	
	boolean func(int m){
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(check(m)) return true;
				right(m);
			}
			up(m);
		}
		right(m);
		up(m);
		for(int i=0;i<4;i++){
			if(check(m)) return true;
			right(m);
		}
		up(m);
		up(m);
		for(int i=0;i<4;i++){
			if(check(m)) return true;
			right(m);
		}
		cnt++;
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			
			c = new int[n][6];
			cnt = 1;
			for(int i=0;i<n;i++){
				for(int j=0;j<6;j++){
					char a = sc.next().charAt(0);
					if(a=='R') c[i][j] = 0;
					else if(a=='Y') c[i][j] = 1;
					else if(a=='B') c[i][j] = 2;
					else if(a=='M') c[i][j] = 3;
					else if(a=='G') c[i][j] = 4;
					else if(a=='C') c[i][j] = 5;
				}
				if(i!=0) func(i);
			}
			System.out.println(n-cnt);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}