import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem1100_AreaOfPolygons {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem1100_AreaOfPolygons test = new Problem1100_AreaOfPolygons();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int caseNumber = 0;
			String line;
			while((line = reader.readLine()) != null) {
				caseNumber++;
				int[][] vertices = new int[Integer.parseInt(line)][2];
				if(vertices.length == 0) {
					break;
				}
				for(int i = 0; i < vertices.length; i++) {
					String[] textArray = reader.readLine().split(" ");
					
					vertices[i][0] = Integer.parseInt(textArray[0]);
					vertices[i][1] = Integer.parseInt(textArray[1]);
				}
				test.showAnswer(vertices, caseNumber);
				reader.readLine();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(int[][] vertices, int caseNumber) {
		int summationArea = getArea(vertices, vertices.length-1, 0);
		for(int i = 1; i < vertices.length; i++) {
			summationArea += getArea(vertices, i-1, i);
		}
		summationArea = Math.abs(summationArea);
		double answer = (double)(summationArea) /2;
		
	//	System.out.printf(caseNumber + " %.1f", summationArea);
		System.out.println(caseNumber + " " + answer);
	}
	int getArea(int[][] vertices, int point1, int point2) {	//OÏ
		int area = vertices[point1][0] * vertices[point2][1] - vertices[point2][0] * vertices[point1][1];
		
		return area;
	}
	
}