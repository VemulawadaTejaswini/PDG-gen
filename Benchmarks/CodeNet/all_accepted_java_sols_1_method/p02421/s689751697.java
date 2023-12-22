import java.util.Scanner;

//20180511
//01

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int turn = scanner.nextInt();
		int pointTaro = 0;
		int pointHanako = 0;

		for(int i = 0;i < turn;i++) {
			String taro = scanner.next();
			String hanako = scanner.next();

			if(taro.compareTo(hanako) == 0) {
				pointTaro += 1;
				pointHanako += 1;
			} else if (taro.compareTo(hanako) > 0) {
				pointTaro += 3;
			} else {
				pointHanako += 3;
			}
		}

		System.out.printf("%d %d\n",pointTaro,pointHanako);

		scanner.close();
    }
}
