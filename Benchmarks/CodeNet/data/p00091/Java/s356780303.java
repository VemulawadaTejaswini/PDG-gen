import java.util.*;

public class Main {
	int n;
	int[][] inputmap = new int[10][10];
	int[][] map = new int[10][10];
	int[] a = new int[]{0,1,-1,0,0,1,1,-1,-1,2,-2,0,0};
	int[] b = new int[]{0,0,0,1,-1,1,-1,1,-1,0,0,2,-2};
	int[] c = new int[]{0,5,9,13};
	int[][] ans;
	
	
	boolean match(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(inputmap[i][j]!=map[i][j]) return false;
			}
		}
		return true;
	}
	
	void loop(int m){
		if(m==n){
			if(match()){
				for(int i=0;i<n;i++) System.out.println(ans[i][0] + " " + ans[i][1] + " " + ans[i][2]);
				System.exit(0);
			}else{
				return;
			}
		}
		
		for(int i=1;i<9;i++){
			for(int j=1;j<9;j++){
				for(int k=1;k<=3;k++){ 
					if(k==3 && (i==1 || j==1 || i==8 || j==8)) continue;
					boolean flag = true;
					for(int s=0;s<c[k];s++){
						map[i+a[s]][j+b[s]]++;
						if(inputmap[i+a[s]][j+b[s]]<map[i+a[s]][j+b[s]]){
							flag = false;
							for(int t=s;t>=0;t--) map[i+a[t]][j+b[t]]--;
							break;
						}
					}
					if(flag==true){
						ans[m][0] = j;
						ans[m][1] = i;
						ans[m][2] = k;
						loop(m+1);
						for(int s=0;s<c[k];s++) map[i+a[s]][j+b[s]]--;
					}
				}
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				inputmap[i][j] = sc.nextInt();
			}
		}
		ans = new int[n][3];
		loop(0);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}