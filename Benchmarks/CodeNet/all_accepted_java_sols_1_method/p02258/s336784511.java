import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int b = sc.nextInt();
		int max = b;
		int out = 0;
		int min = b;
		int sec = -1000000000;
		int thr = -1000000000;
		for(int i = 1;i <= size - 1;i++){
			int num = sc.nextInt();
			if (max <= num){
				max = num;
				if(sec < max - min){
					sec = max - min;
				}		
			}else if(min > num){
				min = num;
				if(thr < min - max){
					thr = min - max;
				}
				max = num;
			}
			
		}
		if(sec < thr){
			out = thr;
		}else{
			out = sec;
		}
		System.out.println(out);
	}
	
	
}