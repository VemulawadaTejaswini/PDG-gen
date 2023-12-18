import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean first = true;

		while(true){
			int from = sc.nextInt();
			int to = sc.nextInt();
			if(from == 0 && to == 0) break;

			if(first) first = false;
			else System.out.println();

			boolean flg = true;
			for(int i=from;i<=to;i++){
				if(isLeap(i)){
					flg = false;
					System.out.println(i);
				}
			}

			if(flg) System.out.println("NA");
		}
	}

	private static boolean isLeap(int y){
		if(y % 4 == 0){
			if(y % 100 == 0){
				if(y % 400 == 0) return true;
				return false;
			}
			return true;
		}
		return false;
	}
}