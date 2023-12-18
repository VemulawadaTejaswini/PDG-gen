import java.util.Scanner;
import java.util.ArrayList;


class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int x = scan.nextInt();
		while(x != 0){
			arr.add(x);
			x = scan.nextInt();
		}
		
		int size = arr.size();
		for(int i = 0; i < size; i++){
			System.out.println("Case " + (i + 1) + ": " + arr.get(i));
		}
	}
}
