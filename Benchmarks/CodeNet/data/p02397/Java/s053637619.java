import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//再利用の時はここからけす

		while(true) {
			int getDatax = sc.nextInt();
			int getDatay = sc.nextInt();

			if(getDatax == 0 && getDatay == 0) {
				break;
			}

			if(getDatax > getDatay) {
				System.out.println(getDatay  + " " + getDatax);
			}else {
				System.out.println(getDatax  + " " + getDatay);
			}

		}





	//ここから上を消すこと
	}
}

