
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
                int time;
		int[][] JOI = new int[H][W];
		for(int i=0; i<H; i++){
		    char[]zmb =sc.next().toCharArray();
		    time = -1;
		    for(int j=0; j<W; j++){
		    	if(zmb[j] =='c') time = 0;
		        JOI[i][j] =time;
		        if(time>=0) time++;
		    }
		}
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++){
				if(j ==W-1) {
					System.out.println(JOI[i][j]);
				}else{
					System.out.println(JOI[i][j]+" ");
				}
			}
		}
	}

}