import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n == 0)break;
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i = 0; i < n; i++)
				list.add(sc.nextInt());
				
			Collections.sort(list);
			list.remove(0);
			list.remove(list.size()-1);
			
			int sum = 0;
			for(int i = 0; i < list.size(); i++)
				sum += list.get(i);
			sum = sum / list.size();
			
			System.out.println(sum);
		}
		}
}