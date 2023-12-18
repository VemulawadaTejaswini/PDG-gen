import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int b = sc.nextInt();
		int max = b;
		int out = 0;
		int min = b;
		int sec = 0;
		for(int i = 1;i <= size - 1;i++){
			int num = sc.nextInt();
			if (max < num){
				max = num;
				if(sec < max - min){
					sec = max - min;
				}		
			}else if(min > num){
				max = num;
				min = num;
			}
			
		}
		if(sec < max - min){
			out = max - min;
		}else{
			out = sec;
		}
		System.out.println(out);
	}
	
	
}