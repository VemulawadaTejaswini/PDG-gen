import java.util.*;

public class Main {
	//0155 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			int [][]  data = new int[n][n]; 
			for(int i = 0 ; i < n; i++){
				String s = sc.next();
				for(int j = 0 ; j < n; j++){
					char c = s.charAt(j);
					if(c == '.'){
						int value = 0;
						if(isOK(i - 1, j, n)){
							value += data[i-1][j];
						}
						if(isOK(i,j-1, n)){
							value += data[i][j-1];
						}
						if(isOK(i-1, j-1, n)){
							value -= data[i-1][j-1];
						}
						data[i][j] = Math.max(value, 0) + 1;
					}
					else{
						data[i][j] = 0;
					}
				}
			}
			
			int ans = 0;
			for(int i = 0 ; i < n; i++){
				for(int j = 0 ; j < n; j++){
					if(data[i][j] > 0){
						ans = Math.max(ans, 1);
						
						for(int k = 1 ; k < 10; k++){
							int xx = j + k;
							int yy = i + k;
							if(! isOK(xx, yy, n)) break;
							if(data[yy][xx] == 0) break;
							int res = 0;
							if(isOK(j-1, i-1, n)){
								res += data[i-1][j-1];
							}
							if(isOK(j-1, yy, n)){
								res -= data[yy][j-1];
							}
							if(isOK(xx, i-1, n)){
								res -= data[i-1][xx];
							}
							res+= data[yy][xx];
							int sq = (int)Math.sqrt(res);
							if(sq * sq == res){
								ans = Math.max(ans, sq);
							}
						}
						
					}
				}
			}
			System.out.println(ans);
			
			//debug
//			for(int i = 0 ; i < n; i++){
//				for(int j = 0 ; j < n; j++){
//					System.out.print(data[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
		}
	}
	private boolean isOK(int x, int y,int n) {
		if(0<= x && x < n && 0<= y && y < n){
			return true;
		}
		return false;
	}
	public static void main(String [] args){
		new Main().doit();
	}
}