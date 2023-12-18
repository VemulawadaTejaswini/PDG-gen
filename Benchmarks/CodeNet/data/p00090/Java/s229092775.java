import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		Main instance = new Main();
		instance.execute();
	}
	
	private void execute() throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		Map<Integer, Set<Integer>> cross = calculateCross(toDataArray(sc));
		int result = 0;
		for(Integer num : cross.keySet()) {
			result = Math.max(result, countCrossover(cross, cross.get(num), 0));
		}
		
		System.out.println(result);
	}
	private double[][] toDataArray(BufferedReader sc) throws IOException {
		int rows = Integer.parseInt(sc.readLine());
		double[][] dataArray = new double[rows][2];
		
		String[] line;
		for(int i = 0 ; i < rows ; i++) {
			line = sc.readLine().split(",");
			dataArray[i][0] = Double.parseDouble(line[0]);
			dataArray[i][1] = Double.parseDouble(line[1]);
		}
		
		sc.readLine();
		
		return dataArray;
	}

	private Map<Integer, Set<Integer>> calculateCross(double[][] dataArray) {
		Map<Integer, Set<Integer>> cross = new HashMap<Integer, Set<Integer>>();
		
		Set<Integer> result;
		for(int i = 0 ; i < dataArray.length ; i++) {
			result = new HashSet<Integer>();
			for(int j = i + 1 ; j < dataArray.length ; j++) {
				if(Math.pow(dataArray[i][0] - dataArray[j][0], 2) + 
				   Math.pow(dataArray[i][1] - dataArray[j][1], 2) <= 4) {
					result.add(j);
				}
			}
			cross.put(i, result);
		}
		
		return cross;
	}
	
	private int countCrossover(Map<Integer, Set<Integer>> cross, Set<Integer> currentCross, int currentCount) {
		int result = 1;
		Integer[] currentCrossArray = currentCross.toArray(new Integer[currentCross.size()]);
		Set<Integer> target;
		for(int i = 0 ; i < currentCrossArray.length ; i++) {
			target = cross.get(currentCrossArray[i]);
			for(int j = i + 1 ; j < currentCrossArray.length ; j++) {
				if(target.contains(currentCrossArray[j])) {
					result = Math.max(result, countCrossover(cross, target, currentCount));
				}
			}
		}
		return currentCount + result;
	}
}