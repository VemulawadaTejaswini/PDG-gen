import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int n = scan.nextInt();
			int cnt = 0;
			for(int a = 0; a <= 9; a++){
				for(int b = 0; b <= 9; b++){
					for(int c = 0; c <= 9; c++){
						for(int d = 0; d <= 9; d++){
							if(a + b + c + d == n){
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