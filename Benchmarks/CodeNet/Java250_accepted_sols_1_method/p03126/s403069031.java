import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = Integer.parseInt(sc.nextLine().trim());
		
		int[] i = new int[M];
		
		for(int j = 0; j < i.length; j++) {
			i[j] = 0;
		}
		
		for(int k = 0; k < N; k++) {
			String s = sc.nextLine();
			String[] split = s.split(" ");
			
			for(int l = 1; l < split.length; l++) {
				int a = Integer.parseInt(split[l])-1;
				
				i[a]++;
			}
		}
		
		int res = 0;
		
		for(int n = 0; n <i.length; n++) {
			if(i[n] == N) {
				res++;
			}
		}
		System.out.println(res);
	}
}