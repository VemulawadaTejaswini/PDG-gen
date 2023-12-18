import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer> tableA= new ArrayList<Integer>();
	static ArrayList<Integer> tableB= new ArrayList<Integer>();
	static int numA;
	static int numB;
	static int timeLimit;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		numA = sc.nextInt();
		numB = sc.nextInt();
		timeLimit = sc.nextInt();

		for(int i=0;i<numA;i++) {
			tableA.add(sc.nextInt());
		}

		for(int i=0;i<numB;i++) {
			tableB.add(sc.nextInt());
		}

		sc.close();

		int result = readbook(0,0,0,0);

		System.out.println(result);

	}

	static int readbook(int indexA,int indexB,int nowtime,int resultTmp){

		// タイムリミットオーバーチェック
		if(nowtime > timeLimit) {
			if(indexA + indexB - 1 > resultTmp) {
				resultTmp = indexA + indexB - 1;
			}
			return resultTmp;
		}

		// 本をすべて読みきったかチェック
		if(indexA == numA-1 && indexB == numB-1) {
			return numA + numB;
		}

		// 本棚AからindexA番目の本を読んだ場合のケース
		int result = 0;
		if(indexA < numA) {
			result = readbook(indexA+1,indexB,nowtime+tableA.get(indexA),resultTmp);
		}

		if(indexB < numB) {
			int tmp = readbook(indexA,indexB+1,nowtime+tableB.get(indexB),resultTmp);
			if(tmp > result) {
				result = tmp;
			}
		}

		// 本棚BからindexB番目の本を読んだ場合のケース
		return result;

	}


}