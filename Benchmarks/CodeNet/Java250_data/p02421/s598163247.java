import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int taroPoint = 0;
		int hanakoPoint = 0;

		String taro;
		String hanako;

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			int gameCount = sc.nextInt();

			for (int i = 0; i < gameCount; i++) {
				taro = sc.next();

				hanako = sc.next();

				int judge = taro.compareTo(hanako);

				//?????????????????????
				if (judge > 0) {
					taroPoint += 3;
				}else if(judge < 0){
					hanakoPoint += 3;
				}else{
					taroPoint += 1;
					hanakoPoint += 1;
				}

			}
			System.out.println(taroPoint + " " + hanakoPoint);
		} finally {
			sc.close();
		}
	}

}