import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(sc.hasNextInt()){
		int L = sc.nextInt();
		if(L == 0)break;
		int x = 0;
		int count = 0;
		
		while(L >= x){
			if(count == 13)break;
			x += sc.nextInt() - sc.nextInt();
			count++;
		}
		}
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) <= 12)System.out.println(list.get(i));
			else System.out.println("NA");
		}
	}
}