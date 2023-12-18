import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		int[] tri = new int[3];
		boolean flag = false;
		int N = scan.nextInt();
		for(int i = 0; i < N; i++){
			for(int j = 0; j < 3; j++){
				tri[j] = scan.nextInt();
			}
			for(int j = 0; j < tri.length - 1; j++){
				for(int k = tri.length - 1; k > j; k--){
					if(tri[j] < tri[k]){
						int big = tri[k];
						tri[k] = tri[j];
						tri[j] = big;
					}
				}
			}
			if(Math.pow(tri[0], 2) == Math.pow(tri[1], 2) + Math.pow(tri[2], 2)){
				flag = true;
			} else{
				flag = false;
			}
			list.add(flag? "YES" : "NO");
		}
		for(String s : list){
			System.out.printf("%s\n", s);
		}
	}
}