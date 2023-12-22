import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		ArrayList<Integer> list_m = new ArrayList<Integer>();//モンスター
		ArrayList<Integer> list_y = new ArrayList<Integer>();//討伐数


		for(int i = 0 ;i < N+1;i++){
			list_m.add(sc.nextInt());
			
		}
		for(int i = 0 ;i < N;i++){
			list_y.add(sc.nextInt());
			
		}

		long cnt = 0;
		for(int i = 0 ;i < N;i++){
			if(list_m.get(i) > list_y.get(i)) {
				cnt = cnt + list_y.get(i);
				list_m.set(i, list_m.get(i)-list_y.get(i));
				list_y.set(i, 0);
			}else {
				cnt = cnt + list_m.get(i);
				list_y.set(i, list_y.get(i)-list_m.get(i));
				list_m.set(i, 0);
			}

			if(list_m.get(i+1) > list_y.get(i)) {
				cnt = cnt + list_y.get(i);
				list_m.set(i+1, list_m.get(i+1)-list_y.get(i));
				list_y.set(i, 0);
			}else {
				cnt = cnt + list_m.get(i+1);
				list_y.set(i, list_y.get(i)-list_m.get(i+1));
				list_m.set(i+1, 0);
			}

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(cnt);

   		sc.close();
        return ;

    }
    
}

