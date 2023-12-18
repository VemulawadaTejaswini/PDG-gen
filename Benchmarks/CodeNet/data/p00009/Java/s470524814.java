import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int n = scan.nextInt();
			boolean flag = false;
			int cnt = 0;
			for(int i = 2; i <= n; i++){
				for(int j = 2; j <= i; j++){
					if((j !=i) && (i % j == 0)){
						flag = false;
					}
					if(flag == false && j == i){
						flag = true;
						cnt++;
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