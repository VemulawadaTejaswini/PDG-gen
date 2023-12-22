import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] h = new int[300], w = new int[300];
		int cnt = 0;
		
		while(true){
			h[cnt] = sc.nextInt();
			w[cnt] = sc.nextInt();
			
			if(w[cnt] == 0 && h[cnt] == 0)
				break;
			
			cnt ++;
		}
		
		for(int i = 0; i < cnt; i++){
			for(int j = 0; j < h[i]; j++){
				for(int k = 0; k < w[i]; k++){
					if(j == 0 || j == h[i] - 1 || k == 0 || k == w[i] - 1)
						System.out.print("#");
					else
						System.out.print(".");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}