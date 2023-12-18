import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true){
			int L = sc.nextInt();
			if(L == 0)break;
			
			int sum = 0;
			int count = 0;
			boolean is = true;
			while(L >= sum){
				count++;
				if(count > 12){
					is = false;
					break;
				}
				sum += sc.nextInt() - sc.nextInt();
			}
			if(is)list.add(count);
			else  list.add(0);
		}
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) == 0)System.out.println("NA");
			else System.out.println(list.get(i));
		}
	}
}