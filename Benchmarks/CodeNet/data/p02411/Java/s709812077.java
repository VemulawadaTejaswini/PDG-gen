import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	private static enum GRADE_POINT_AVERAGE {
		A, B, C, D, F;
	}

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String[] inputData = null;
		int sum = 0;
		int testConductor = 0;
		Map<Integer, GRADE_POINT_AVERAGE> grades = new LinkedHashMap<>();

		while (true) {
			inputData = (input.readLine()).split("\\s");
			if(judgeEnd(inputData)) {
				break;
			}
			testConductor++;
			sum = Integer.parseInt(inputData[0]) + Integer.parseInt(inputData[1]);
			if (sum < 30 || (Integer.parseInt(inputData[0]) == -1 || Integer.parseInt(inputData[1]) == -1)) {
			    grades.put(testConductor, GRADE_POINT_AVERAGE.F);
			} else if (sum >= 80) {
			    grades.put(testConductor, GRADE_POINT_AVERAGE.A);
			} else if (sum >= 65 && sum < 80) {
			    grades.put(testConductor, GRADE_POINT_AVERAGE.B);
			} else if (sum >= 50 && sum < 65) {
			    grades.put(testConductor, GRADE_POINT_AVERAGE.C);
			} else if (sum >= 30 && sum < 50) {
				if (Integer.parseInt(inputData[2]) >= 50) {
				  grades.put(testConductor, GRADE_POINT_AVERAGE.C);
				} else {
				  grades.put(testConductor, GRADE_POINT_AVERAGE.D);
				}
			}
		}
		// 表示
		for (Map.Entry<Integer, GRADE_POINT_AVERAGE> grade : grades.entrySet()) {
			System.out.println(grade.getValue());
		}
	}

	public static boolean judgeEnd (String[] inputData) {
		boolean judgeEnd = false;
		int countEnd = 0;
		for (String input : inputData) {
			if(("-1").equals(input)) {
				countEnd++;
			}
		}
		if (countEnd == inputData.length) {
			judgeEnd = true;
		}
		return judgeEnd;
	}

}

