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

		int firstNumA = 0;
		int firstNumB = 0;

		// A棚のN冊の本を読む時間を格納する
		for(int i=1;i<=numA;i++) {
			tableA.add(sc.nextLong());
		}

		// B棚のN冊の本を読む時間を格納する
		for(int i=1;i<=numB;i++) {
			tableB.add(sc.nextLong());
		}
		sc.close();

		long nowTime = 0;
		int indexA = 0;
		int indexB = 0;
		int result = 0;
		for(int i=1;i<=numA+numB;i++) {

			if(tableA.size() <= indexA && tableB.size() <= indexB) {
				break;
			}

			if(isReadA(indexA,indexB)) {
				nowTime = nowTime + tableA.get(indexA);
				indexA++;
			}else {
				nowTime = nowTime +tableB.get(indexB);
				indexB++;
			}

			if(nowTime <= timeLimit) {
				result++;
			}else {
				break;
			}

		}

		System.out.println(result);

	}

	static boolean isReadA(int indexA,int indexB) {

		if(tableB.size() <= indexB) {
			return true;
		}

		if(tableA.size() <= indexA) {
			return false;
		}

		if(tableA.get(indexA) < tableB.get(indexB)) {
			return true;
		}

		if(tableA.get(indexA) > tableB.get(indexB)) {
			return false;
		}

		if(tableA.get(indexA) == tableB.get(indexB)) {
			return isReadA(indexA+1,indexB+1);
		}

		return true;

	}


}