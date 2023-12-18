import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[] weather = new char[W];
		int[][] p = new int[H][W];
		
	    
	    for(int i = 0; i < H; i++){
	    	weather = sc.next().toCharArray();
	    	int cnt = -1;
	    	for(int k = 0; k < W; k++){
	    		if(weather[k] == 'c'){
	    			cnt = 0;
	    		}
	    		else if(cnt != -1 && weather[k] == '.'){
	    			cnt++;
	    		}
	    		p[i][k] = cnt;
	    	}
	    }
	    
	    for(int i = 0; i < H; i++){
	    	for(int k = 0; k < W; k++ ){
	    		System.out.print(p[i][k]);
	    		if(k < W-1)System.out.print(" ");
	    		if(k != 0 && k % (W-1) == 0) System.out.println();
	    	}
	    }
	    sc.close();
	}

}