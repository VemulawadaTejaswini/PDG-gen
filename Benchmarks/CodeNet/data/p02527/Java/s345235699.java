import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = sc.nextInt();
		for(int i = 0; i < num; i++){
			list.add(sc.nextInt());
		}
		
		sortList(list);
		
		for(int i = 0; i < list.size(); i++){
			System.out.printf("%d", list.get(i));
			if(!(i == list.size() - 1)){
				System.out.printf(" ");
			}
			else{
				System.out.printf("\n");
			}
		}
	}
	
	public static void sortList(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			for(int j = list.size() - 1; i < j; j--){
				if(list.get(j) < list.get(i)){
					int tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
	}
}