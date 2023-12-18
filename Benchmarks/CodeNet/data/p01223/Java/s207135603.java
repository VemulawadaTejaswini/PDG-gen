import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static int H,W;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		int num_set = scanner.nextInt();

		StringBuilder ans = new StringBuilder();

		for(int loop = 0; loop < num_set; loop++){

			int N = scanner.nextInt();

			int up_max = 0,down_max = 0;

			int pre = scanner.nextInt();
			int tmp;

			for(int i = 1; i < N; i++){

				tmp = scanner.nextInt();
				if(tmp > pre){

					up_max = Math.max(up_max, tmp-pre);

				}else if(tmp < pre){

					down_max = Math.max(down_max, pre-tmp);
				}
				pre = tmp;
			}

			ans.append(Integer.toString(up_max)).append(" ").append(Integer.toString(down_max)).append("\n");
		}
		System.out.print(ans.toString());
	}
}
