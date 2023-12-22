import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){

			int studentNum = Integer.parseInt(br.readLine());
			if(studentNum == 0){
				break;
			}

			String[] score = br.readLine().split(" ");

			double scoreSum = 0;

			for(int i = 0; i < studentNum;i++){

				scoreSum += Double.parseDouble(score[i]);
			}

			double scoreAverage = scoreSum / studentNum;

			double sigmaSum = 0;

			for (int i = 0;i < studentNum;i++){
				double num = Double.parseDouble(score[i]) - scoreAverage;
				sigmaSum += num * num;
			}

			double sigmaResult = sigmaSum / studentNum;

			double alpha = Math.sqrt(sigmaResult);

			System.out.printf("%.8f\n", alpha);
		}
		br.close();
	}
}