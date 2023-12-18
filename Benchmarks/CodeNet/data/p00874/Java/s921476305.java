import java.util.*;

public class Main {
	public void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			int w = in.nextInt();
			int d = in.nextInt();
			if((w|d)==0){
				break;
			}
			int[] h1 = new int[w];
			int sum=0;
			for(int i = 0; i < w; i++){
				h1[i] = in.nextInt();
				sum+=h1[i];
			}
			for(int j = 0;j < d; j++){
				int buf = in.nextInt();
				for(int i = 0; i < w; i++){
					if(h1[i] == buf){
						buf = h1[i] = 0;
					}
				}				
				sum+=buf;
			}
			System.out.println(sum);
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.run();
	}
}