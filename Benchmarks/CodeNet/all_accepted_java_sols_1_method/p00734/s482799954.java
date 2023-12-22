
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			List<Integer> t_list = new ArrayList<Integer>(n);
			int t_sum = 0;
			List<Integer> h_list = new ArrayList<Integer>(n);
			int h_sum = 0;
			
			for(int i = 0; i < n; i++){
				int num = sc.nextInt();
				t_list.add(num);
				t_sum += num;
			}
			
			for(int i = 0; i < m; i++){
				int num = sc.nextInt();
				h_list.add(num);
				h_sum += num;
			}
			
			int t_op = 1000000, h_op = 1000000;
			
			for(int t_num : t_list){
				for(int h_num : h_list){
					
					if(t_sum - t_num + h_num == h_sum - h_num + t_num){
						if(t_op + h_op > t_num + h_num){
							t_op = t_num;
							h_op = h_num;
						}
					}
					
					
				}
			}
			
			if(t_op > 100 && h_op > 100){
				System.out.println(-1);
			}else{
				System.out.println(t_op + " " + h_op);
			}
			
		}
		
	}

}