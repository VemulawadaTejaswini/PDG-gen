import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Long> tableA= new ArrayList<Long>();
	static ArrayList<Long> tableB= new ArrayList<Long>();
	static int numA;
	static int numB;
	static long timeLimit;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		numA = sc.nextInt();
		numB = sc.nextInt();
		timeLimit = sc.nextLong();

		long tmp;
		int firstNum = 0;

		// A棚のN冊の本を読む時間を格納する
		tmp = 0;
		tableA.add(tmp);
		for(int i=1;i<=numA;i++) {
			tmp = tmp + sc.nextLong();
			tableA.add(tmp);
		}

		// B棚のN冊の本を読む時間を格納する
		tmp = 0;
		tableB.add(tmp);
		for(int i=1;i<=numB;i++) {
			tmp = tmp + sc.nextLong();
			tableB.add(tmp);
		}
		sc.close();

		int result = 0;
		int indexB = 0;
		for(int i=0;i <= numA;i++) {

			if(result - i > 0) {
				indexB = 0;
			}else {
				indexB = result - i;
			}

			for(;indexB <= numB;indexB++) {

				if(indexB > numB) {
					break;
				}

				if(tableA.get(i) + tableB.get(indexB) <= timeLimit) {
					if(i+indexB > result) {
						result = i + indexB;
					}
				}else {
					break;
				}

			}
		}

		System.out.println(result);

	}

}