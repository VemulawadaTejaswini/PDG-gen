import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Main {
	public static void main(String[] args) {

		try {
			LineNumberReader lineNumReader = new LineNumberReader(new InputStreamReader(System.in));
			String str = null;
			double  scores[] = null;
			int studentsNum = 0;

			while ((str = lineNumReader.readLine()) != null) {
				if (lineNumReader.getLineNumber()%2 == 1) {
					studentsNum = Integer.parseInt(str);
				}
				if (studentsNum == 0) {
					break;
				}
				if (lineNumReader.getLineNumber() % 2 == 0) {
					String[] points = str.split(" ");
					scores = new double[studentsNum];
					int i = 0;

					for (String point : points) {
						scores[i] = Long.parseLong(point);
						i++;
					}

					double sum = 0;

					for (double score : scores) {
						sum += score;
					}
					double mean = sum / studentsNum;
					double sig2 = 0;

					for (double score : scores) {
						sig2 += Math.pow(score - mean, 2);
					}

					//Σ
					double sigma = Math.sqrt(sig2 / studentsNum);
					System.out.println(String.format("%.8f", sigma));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
