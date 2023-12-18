import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nStudent = 0;
		double result = 0.0;
		double sum = 0.0;
		double average = 0.0;
		double dis = 0.0;
		double standardDiv = 0.0;
		ArrayList<Double> examResults = new ArrayList<Double>();
		ArrayList<Double> results = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);

		while(true){
			nStudent = sc.nextInt();
			if(nStudent == 0){
				break;
			}
			for(int i = 0; i < nStudent; ++i){ //??????????????°??\?????¨????????????????¨?
				result = sc.nextDouble();
				examResults.add(result);
				sum += result;
				if(i == nStudent-1){
					average = sum/i;
					sum = 0;
				}
			}
			int size = examResults.size();
			for(int i = 0; i < size; ++i){ //?????£????±???????
				sum += Math.pow((average-examResults.get(i)), 2);
				if(i == size - 1){
					dis = sum / size; //?????£
				}
			}
			standardDiv = Math.sqrt(dis); //?¨??????????
			results.add(standardDiv);
		}
		for(int j = 0; j < results.size(); ++j){
			System.out.println(results.get(j));
		}
		sc.close();
	}

}