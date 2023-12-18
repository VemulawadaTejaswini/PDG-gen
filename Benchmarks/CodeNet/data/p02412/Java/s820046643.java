import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		int x;
		int intCount;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			n = scan.nextInt();
			x = scan.nextInt();
			intCount = 0;
			if(n == 0 && x == 0){
				break;
			}else{
				for(int i = 1; i <= n; i++){
					for(int j = i + 1; j <= n; j++){
						for(int k = j + 1; k <= n; k++){
							if(i + j + k == x){
								intCount++;
							}
						}
					}
				}
				list.add(intCount);
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		scan.close();
	}
}