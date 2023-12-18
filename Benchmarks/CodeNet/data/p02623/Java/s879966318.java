import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Long> tableA= new ArrayList<Long>();
	static ArrayList<Long> tableB= new ArrayList<Long>();
	static int numA;
	static int numB;
	static int timeLimit;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		numA = sc.nextInt();
		numB = sc.nextInt();
		timeLimit = sc.nextInt();

		long tmp;
		int firstNum = 0;

		// A棚のN冊の本を読む時間を格納する
		tmp = 0;
		tableA.add(tmp);
		for(int i=1;i<=numA;i++) {
			tmp = tmp + sc.nextInt();
			tableA.add(tmp);
			if(tmp <= timeLimit) {
				firstNum = i;
			}
		}

		// B棚のN冊の本を読む時間を格納する
		tmp = 0;
		tableB.add(tmp);
		for(int i=1;i<=numB;i++) {
			tmp = tmp + sc.nextInt();
			tableB.add(tmp);
		}
		sc.close();

	}

}