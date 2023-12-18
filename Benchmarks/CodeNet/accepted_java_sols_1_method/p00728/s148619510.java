
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);

		
		while(true){
			int max  = -1;
			int maxi;
			int min  = 1001;
			int mini;
			int sum = 0;
			
			num = scan.nextInt();
			if(num == 0)break;
			
			int[] scr = new int[num];
			
			for(int i = 0; i < num; i++){
				scr[i] = scan.nextInt();
				if(max < scr[i]){
					max = scr[i];
					maxi = i;
				} 
				if(min > scr[i]){
					min = scr[i];
					mini = i;
				}
				sum += scr[i];
			}
			
			sum -= (max + min);
			sum /= (num-2);
			
			System.out.println(sum);
		
		}
	}

}