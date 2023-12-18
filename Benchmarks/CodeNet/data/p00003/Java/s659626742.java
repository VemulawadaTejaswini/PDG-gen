import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		boolean flag = false;
		int[] tri = new int[3];
		int N = scan.nextInt();
		for(int a = 0; a < N; a++){
			for(int i = 0; i < 3; i++){
				tri[i] = scan.nextInt();
			}
			for(int i = 0; i < 3 - 1; i++){
				for(int j = 3 - 1; j > i; j--){
					if(tri[i] < tri[j]){
						int big = tri[j];
						tri[j] = tri[i];
						tri[i] = big;
					}
				}
			}
			// System.out.printf("%d %d %d\n", tri[0], tri[1], tri[2]);
			if(Math.pow(tri[0], 2) == Math.pow(tri[1], 2) + Math.pow(tri[2], 2)){
				// System.out.println("YES");
				flag = true;
			} else{
				// System.out.println("NO");
				flag = false;
			}
			list.add(flag? "YES" : "NO");
		}

		for(String s : list){
			System.out.println(s);
		}
	}
}