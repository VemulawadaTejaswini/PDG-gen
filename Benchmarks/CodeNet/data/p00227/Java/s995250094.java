import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n,m,sum,count;
		
		while(true){
			list.clear();
			n = sc.nextInt();
			m = sc.nextInt();
			if(n == 0 && m == 0)break;
			
			for(int i = 0; i < n; i++)
				list.add(sc.nextInt());
			
			Collections.sort(list);
			
			sum = count = 1;
			for(int i = n; i > 0; i--){
				if(count != m)
					sum += list.get(i-1);
				else
					count = 0;
				count++;
			}
				
			System.out.println(sum-1);
		}
		sc.close();
	}
}