import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numLong = 0;
		int taroPoint = 0;
		int hanakoPoint = 0;

		boolean hanakoWin = false;
		boolean taroWin = false;

		Scanner sc = null;
		char[] taro;
		char[] hanako;
		try {
			sc = new Scanner(System.in);
			int gameCount = sc.nextInt();

			for (int i = 0; i < gameCount; i++) {
				String line = sc.next();
				taro = line.toCharArray();

				line = sc.next();
				hanako = line.toCharArray();

				if (taro.length < hanako.length) {
					numLong = taro.length;
					hanakoWin = true;
				} else if(taro.length > hanako.length){
					numLong = hanako.length;
					taroWin = true;
				}else{
					numLong = taro.length;
				}

				//?????????????????????
				for (int j = 0; j < numLong; j++) {
					if ((int)taro[j] > (int)hanako[j]) {
						taroPoint += 3;
						break;

					}else if((int)taro[j] < (int)hanako[j]){
						hanakoPoint += 3;
						break;

					}else if(j == numLong - 1){
						if (taroWin) {
							taroPoint += 3;
						}else if(hanakoWin){
							hanakoPoint += 3;
						}else{
							taroPoint += 1;
							hanakoPoint += 1;
						}
					}
				}
			}
			System.out.println(taroPoint + " " + hanakoPoint);
		} finally {
			sc.close();
		}
	}

}