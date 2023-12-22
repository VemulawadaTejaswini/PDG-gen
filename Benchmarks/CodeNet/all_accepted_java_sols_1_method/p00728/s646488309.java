import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String args[]){
		
		int num,max,min,sum,avg;
		Scanner in = new Scanner(System.in);
		
		while(true){
			num = Integer.parseInt(in.next());
			
			if(num == 0)break;
			
			sum = 0;
			max =0;
			min = 1001;
			
			int score[] = new int[num];
			
			for(int i=0;i<num;i++){
				score[i] = Integer.parseInt(in.next());
				sum += score[i];
				
				if(score[i] > max)max = score[i];
				if(score[i] < min)min = score[i];
			}
			
			sum = sum-max-min;
			avg = sum / (num-2);
			
			System.out.println(avg + "");
		}
		
		in.close();
	}
}