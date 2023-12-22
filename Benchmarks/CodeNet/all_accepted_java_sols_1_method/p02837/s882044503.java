import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		
        
        int [] b = new int[N];
		int[][] d = new int[N][N];
		int[][] e = new int[N][N];
		for(int i = 0; i < N; i++){
            b[i] = sc.nextInt();
          
            for(int j = 0; j < b[i]; j++){
                d[i][j] = sc.nextInt();
                d[i][j] --;
             
                e[i][j] = sc.nextInt();
              
            }
        }
        int [] c = new int[N];
        int f = 0;
        int g = 0;
        boolean h = false;
		for(int i = 0; i < (int)Math.pow(2, N ); i++){
              int l = 1;
			for(int j = 0; j < N; j++){
                c[j] = (i / l) % 2;
              l = l * 2;
            }
            h = true;
            for(int j = 0; j < N && h; j++){
                for(int k = 0; k < b[j] && h; k++){
                    if(c[j] == 1 && e[j][k] != c[d[j][k]] ){
                        h = false;
                      
                    }
                }
            }
            if(h){
              
                for(int j = 0; j < N; j++){
                    f += c[j];
                }
                if(f > g){
                    g = f;
                  
                }
                f = 0;
            }
            
		}
      
		System.out.println(g);
		
		
	}
}
