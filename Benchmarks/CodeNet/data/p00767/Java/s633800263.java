package learning;
import java.util.Scanner;

public class MainClass {
	
	public static int cal(int w, int h){
		return w*w + h*h;
	}
	
	public static void print(int w, int h) {
		int d = cal(w,h);
		int optW = w+1;
		int optH = h;
		int optD = cal(optW, optH);
		for(int j = (int)((Math.sqrt(2*d+1)+1)/2) ; j < (int)Math.sqrt(optD-1) + 1 ; j++){
			int i = (int)Math.sqrt(d-j*j)+1;
			if(i >= j){
				continue;
			}
			if(cal(j,i-1) == d && i-1 > h){
				if(optD != d || (optD ==d && optH > i -1)){
					optH = i-1;
					optW = j;
					optD = d;
					continue;
				}
				
			}
			int k = cal(i,j);
			if( k < optD){
				optW = j;
				optH = i;
				optD = k;
			} else if( k == optD){
				if(optH > i){
					optH = i;
					optW = j;
					optD = k;
				}
			}
		}
		
		System.out.println(optH + "," + optW);
		
		
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[][] data = new int[100][2];
		int length = 0;
		while(true){
			data[length][0] = in.nextInt();
			data[length][1] = in.nextInt();
			if(data[length][0] + data[length][1] > 0) length++;
			else break;
		}
		for(int j = 0 ; j < length ; j++){
			print(data[j][1],data[j][0]);
		}
	}

}