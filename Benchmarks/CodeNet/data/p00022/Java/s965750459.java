import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true){
			list.clear();
			int n = sc.nextInt();
			if(n == 0)break;
			for(int i = 0; i < n; i++)
				list.add(sc.nextInt());
			
			long sum = 0; 
			long max = 0;
			for(int i = 0; i < list.size(); i++){
				for(int j = i; j < list.size(); j++){
					sum += list.get(j);
					if(max < sum)max = sum;
				}
				sum = 0;
			}
			System.out.println(max);
		}
		sc.close();
	}
}