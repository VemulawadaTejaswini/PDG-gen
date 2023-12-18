import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	static int matrix[][];
	static int n;
	static int i, j, m;
	static int c;
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = 0;
		try{
			while(true){
				n = Integer.parseInt(br.readLine());
				if(n == 0) return;
				c++;

				matrix = new int[n][n];
				i = 0; j = 0; m = 1;
				while(i < n-1 || j < n-1){
					migiue();
					if(j < n-1){
						j++;
					}else{
						i++;
					}

					hidarishita();
					if(i < n-1){
						i++;
					}else{
						j++;
					}
				}
				matrix[n-1][n-1] = m;
				print(matrix);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	static void migiue(){
		while(i > 0 && j < n-1){
			matrix[i][j] = m;
			m++;
			i--;
			j++;
		}
		matrix[i][j] = m;
		m++;
	}

	static void hidarishita(){
		while(j > 0 && i < n-1){
			matrix[i][j] = m;
			m++;
			j--;
			i++;
		}
		matrix[i][j] = m;
		m++;
	}

	static void print(int m[][]){
		System.out.println("Case " + c + ":");
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(String.format("%1$3d", m[i][j]));
			}
			System.out.println();
		}
	}
}