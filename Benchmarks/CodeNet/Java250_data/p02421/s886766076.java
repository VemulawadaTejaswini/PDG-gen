import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int taroPoint = 0;
		int hanakoPoint = 0;

		for(int i=0; i<num; i++) {
			String taro = sc.next();
			String hanako = sc.next();
			if(taro.compareTo(hanako) < 0) {
				hanakoPoint += 3;
			} else if(taro.compareTo(hanako) > 0) {
				taroPoint += 3;
			} else {
				hanakoPoint++;
				taroPoint++;
			}
		}

		sc.close();

		System.out.println(taroPoint + " " + hanakoPoint);

	}

}

