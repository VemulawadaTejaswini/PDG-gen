import java.util.Scanner;
public class Main {
	
	public void kumo(int h, int w, int[][] p, char[] weather){
		for(int i = 0; i < h; i++){   //????????????
			Scanner sc = new Scanner(System.in);
	    	weather = sc.next().toCharArray();
	    	
	    	int cnt = -1;  //?????????????????????
	    	for(int k = 0; k < w; k++){   //????????????
	    		if(weather[k] == 'c'){
	    			cnt = 0;
	    		}
	    		else if(cnt != -1 && weather[k] == '.'){
	    			cnt++;
	    		}
	    		p[i][k] = cnt;   //????????¨???int????????????????´?
	    	}
	    }
	}
	
	void doIt(){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] p = new int[h][w];
		char[] weather = new char[w];
		
		kumo(h, w, p, weather);
		
		for(int i = 0; i < h; i++){
	    	for(int k = 0; k < w; k++ ){
	    		System.out.print(p[i][k]);
	    		if(k < w-1)System.out.print(" ");  //??????
	    		if(k != 0 && k % (w-1) == 0) System.out.println(); //??????
	    	}
	    }
	    sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}