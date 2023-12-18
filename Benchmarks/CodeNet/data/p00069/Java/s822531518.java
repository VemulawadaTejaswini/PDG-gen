import java.util.*;

public class Main {
	//0114 cording start
	int n,m,goal,d;
	StringBuilder []s;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			m = sc.nextInt();
			goal = sc.nextInt();
			d = sc.nextInt();
			s = new StringBuilder[d];
			for(int i = 0 ; i< d; i++){
				s[i] = new StringBuilder(sc.next());
			}
			
			if(solve()){
				System.out.println("0");
			}
			else{
				boolean flg = false;
				for(int i = 0 ; i < d; i++){
					for(int j =0; j < n-1; j++){
						if(s[i].charAt(j) == '0'){
							if((j == 0 || s[i].charAt(j-1) == '0') && (j == n-2 || s[i].charAt(j+1) == '0')){
								s[i].setCharAt(j, '1');
								if(solve()){
									System.out.println((i +1) + " " + (j + 1));
									flg = true;
									break;
								}
								else{
									
								}
								s[i].setCharAt(j, '0');
							}
						}
					}
					if(flg){
						break;
					}
				}
				if(! flg){
					System.out.println("1");
				}
			}
		}
	}

	private boolean solve() {
		int now = m-1;
		for(int i = 0 ; i < d; i++){
			if(now- 1 >= 0 && s[i].charAt(now-1) == '1'){
				now = now - 1;
			}
			else if(now < n - 1 && s[i].charAt(now) == '1'){
				now = now + 1;
			}
			else{
				
			}
		}
		if(now == goal - 1){
			return true;
		}
		return false;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}