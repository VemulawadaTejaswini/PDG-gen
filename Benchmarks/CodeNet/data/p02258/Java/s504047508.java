import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int b = sc.nextInt();
		int num = sc.nextInt();
		int max = num - b;//-2
		int out = 0;
		int sec = 0;
		b = num;//3
		boolean h = false;
		if(max >= 0){
			h = true;
		}
		for(int i = 1;i <= size - 2;i++){
			num = sc.nextInt();//3
			if (b <= num){
				if(h){
					max += num - b;
				}else{
					max = num - b;
				}
				h = true;
			}else if(b > num && max <= num - b){
				max = num - b;
				h = false;
			}else if(b > num){
				h = false;
			}
			b = num;//4
		}
		out = max;
		System.out.println(out);
	}
	
	
}