import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] data = str.split(" ");
		int num[] = new int[data.length];
		for(int i = 0; i < data.length; i++){
			num[i] = Integer.parseInt(data[i]);
		}
	
		int a = num[0];
		int b = num[1];
		int c = num[2];


		ArrayList<Integer> yaku = new ArrayList<Integer>();
		for(int i = a; i <= b; i++){
			if(c % i == 0){
				yaku.add(i);
			}
		}
		int x = yaku.size();
		System.out.println(x);
	}
}
