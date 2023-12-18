import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int cnt = 0;
			int n = scan.nextInt();
			for(int i = 0; i <= 9; i++){
				for(int j = 0; j <= 9; j++){
					for(int k = 0; k <= 9; k++){
						for(int l = 0; l <= 9; l++){
							if(i + j + k + l == n){
								cnt++;
							}
						}
					}
				}
			}
			list.add(cnt);
		}
		for(int n : list){
			System.out.printf("%d\n", n);
		}
	}
}