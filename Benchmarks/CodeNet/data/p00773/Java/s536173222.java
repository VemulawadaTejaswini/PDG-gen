import java.util.*;

public class Main{
	void run(){
		Scanner sc = new Scanner(System.in);
		int x, y ,s;
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			s = sc.nextInt();
			if(x == 0 && y == 0 && s == 0) {
				break;
			}
			int aprice = s * 100 / (100+x);
			int bprice = 1;
			int times = aprice/2;
			int max = 0;
			for(int i = 0; i < times; i++){
				int sum = aprice * (100 + y) / 100  + bprice * (100 + y) / 100;
				if(sum > max) max = sum;
				aprice--;
				bprice++;
			}
			System.out.println(max);
			
		}
		
	}
	public static void main(String[] args){
		new Main().run();
	}
}