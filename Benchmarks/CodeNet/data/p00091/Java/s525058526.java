import java.util.*;

public class Main {
	int n;
	int[][] inputmap = new int[10][10];
	int[][] map = new int[10][10];
	int[] a = new int[]{0,1,-1,0,0,1,1,-1,-1};
	int[] b = new int[]{0,0,0,1,-1,1,-1,1,-1};
	LinkedList<Integer> y = new LinkedList<Integer>();
	LinkedList<Integer> x = new LinkedList<Integer>();
	LinkedList<Integer> p = new LinkedList<Integer>();
	
	void check(int u, int v, int w){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(inputmap[i][j]<map[i][j]) return;
			}
		}
		y.push(u);
		x.push(v);
		p.push(w);
		loop();
		y.pop();
		x.pop();
		p.pop();
	}
	
	boolean match(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(inputmap[i][j]!=map[i][j]) return false;
			}
		}
		return true;
	}
	
	void loop(){
		if(x.size()==n){
			if(match()){
				for(int i=0;i<n;i++) System.out.println(x.get(i) + " " + y.get(i) + " " + p.get(i));
				System.exit(0);
			}else{
				return;
			}
		}
		for(int i=1;i<9;i++){
			for(int j=1;j<9;j++){
				for(int k=1;k<=3;k++){ 
					if(k==1){
						for(int s=0;s<5;s++) map[i+a[s]][j+b[s]]++;
						check(i, j, k);
						for(int s=0;s<5;s++) map[i+a[s]][j+b[s]]--;
					}else if(k==2){
						for(int s=0;s<9;s++) map[i+a[s]][j+b[s]]++;
						check(i, j, k);
						for(int s=0;s<9;s++) map[i+a[s]][j+b[s]]--;
					}else if(k==3){
						if(i==1 || j==1 || i==8 || j==8) continue;
						for(int s=0;s<9;s++) map[i+a[s]][j+b[s]]++;
						for(int s=1;s<5;s++) map[i+a[s]*2][j+b[s]*2]++;
						check(i, j, k);
						for(int s=0;s<9;s++) map[i+a[s]][j+b[s]]--;
						for(int s=1;s<5;s++) map[i+a[s]*2][j+b[s]*2]--;	
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
		loop();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}