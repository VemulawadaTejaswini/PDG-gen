import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Double> sdList = new ArrayList<>();
		
		while (true) {
		try {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				break;
			}
			String[] score = br.readLine().split("\\s");
			double average = 0;
			double sum = 0;
			for (int i = 0; i < score.length; i++) {
				sum += Double.parseDouble(score[i]);
			}
			average = sum / n;
			double a = 0;
			for (int i = 0; i < n; i++) {
				a += Math.pow((Double.parseDouble(score[i]) - average), 2);
			}
			a = Math.sqrt(a/(double)n);
			sdList.add(a);
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		}
		for (double sd : sdList) {
			System.out.printf("%.10f\n", sd);
		}
	}

}

