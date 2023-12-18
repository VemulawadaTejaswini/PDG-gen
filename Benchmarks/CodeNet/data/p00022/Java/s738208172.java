import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int num = sc.nextInt();
			
			if(num == 0)break;
			
			int sum = sc.nextInt();
			int max = sum;
			
			for(int i = 0; i < num; i++){
				int n = sc.nextInt();
				
				if(sum + n < n){
					sum = n;
				}else{
					sum += n;
				}
				max = Math.max(max, sum);
			}
			System.out.println(max);
		}
	}
}