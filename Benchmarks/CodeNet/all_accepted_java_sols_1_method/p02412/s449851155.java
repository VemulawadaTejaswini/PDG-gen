import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		for(;;){
			int n = scan.nextInt();
			int x = scan.nextInt();
			if(n == 0 && x == 0){
				break;
			}
			int cnt = 0;
			for(int i = 1; i <= n; i++){
				for(int j = i + 1; j <= n; j++){
					for(int k = j + 1; k <= n; k++){
						if(i + j + k == x){
							cnt++;
						}
					}
				}
			}
			list.add(cnt);
		}

		for(int c : list){
			System.out.println(c);
		}
	}
}