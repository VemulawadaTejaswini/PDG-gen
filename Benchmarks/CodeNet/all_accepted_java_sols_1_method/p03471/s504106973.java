import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String NY[] = scanner.nextLine().split(" ",0);
		int N = Integer.parseInt(NY[0]);
		int Y = Integer.parseInt(NY[1]);
		int x = -1;
		int y = -1;
		int z = -1;

		for(int i = 0; i <= N; i++){
			//System.out.println((N - i) + " "+ i + " "+ 0 + " " + ((N - i) * 10000 + i * 5000));
			if((N - i) * 10000 + i * 5000 == Y){
				x = N - i;
				y = i;
				z = 0;
				break;
			}else{
				for(int j = 1; j <= i; j++){
					//System.out.println((N - i) + " "+ (i - j) + " "+ j + " " + ((N - i) * 10000 + (i - j) * 5000 + j * 1000));
					if((N - i) * 10000 + (i - j) * 5000 + j * 1000 == Y){
						x = N - i;
						y = i - j;
						z = j;
						break;
					}
				}
			}
		}
		System.out.println(x + " " + y + " " + z);
	}

}
