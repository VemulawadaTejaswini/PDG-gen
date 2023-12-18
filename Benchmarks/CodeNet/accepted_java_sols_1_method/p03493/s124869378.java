import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String val = sc.next().trim();

		String[] vals = new String[3];
		vals[0] = val.substring(0, 1);
		vals[1] = val.substring(1, 2);
		vals[2] = val.substring(2, 3);

		int count=0;

		for(int i = 0; i<3; i++){
			if (vals[i].equals("1")){
				count ++;
			}
		}

		System.out.println(count);

		sc.close();
	}

}