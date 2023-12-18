import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		while(true){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int studentNum = 0;
			int scoreSum = 0;
			int scoreAverage = 0;
			int sigmaResult = 0;

			studentNum = Integer.parseInt(br.readLine());
			if(studentNum == 0){
				break;
			}

			String[] score = br.readLine().split(" ");

			for(int i = 0; i < studentNum;i++){
				score[i] = br.readLine();

				scoreSum =+ Integer.parseInt(score[i]);

				if(scoreSum != -1){

				}
			}

				scoreAverage = scoreSum / studentNum;
				}
			}
			for (int i = 0;i < studentNum - 1;i++){
				int sigmaSum =+ (Integer.parseInt(score[i]) - scoreAverage) * (Integer.parseInt(score[i]) - scoreAverage);
				if (j == studentNum - 1){
					sigmaResult = sigmaSum / studentNum;
				}
			}
			double alpha = Math.sqrt(sigmaResult);

			System.out.printf("% .8f\n", alpha);
		}

	}