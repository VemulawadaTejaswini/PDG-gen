import java.util.HashMap;
import java.util.Scanner;

/**
 * Circles - Intersection
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=CGL_7_A
 * 
 * @author Ayaka
 *
 */
public class Main {

	public static void main(String[] args) {
		HashMap<String, Double> circleMap1 = createCircleMap();
		HashMap<String, Double> circleMap2 = createCircleMap();
		
		int result = judge(circleMap1, circleMap2);
		
		System.out.println(String.valueOf(result));
	}
	
	private static HashMap<String, Double> createCircleMap() {

		Scanner scan = new Scanner(System.in);
		double cx = scan.nextInt();
		double cy = scan.nextInt();
		double cr = scan.nextInt();
		
		HashMap<String, Double> circleMap = new HashMap<String, Double>();
		circleMap.put("cx", cx);
		circleMap.put("cy", cy);
		circleMap.put("cr", cr);

		return circleMap;
	}

	private static int judge(HashMap<String, Double> circleMap1, HashMap<String, Double> circleMap2){
		double cx1 = circleMap1.get("cx");
		double cy1 = circleMap1.get("cy");
		double cr1 = circleMap1.get("cr");
		
		double cx2 = circleMap2.get("cx");
		double cy2 = circleMap2.get("cy");
		double cr2 = circleMap2.get("cr");
		
		double dis2 = Math.pow(cx2-cx1, 2) + Math.pow(cy2-cy1, 2);	// dis^2 = (x2-x1)^2 + (y2-y1)^2
		double dis = Math.sqrt(dis2);	
		
		if (dis > cr1+cr2) {
			return 4;
		} else if (dis == cr1+cr2) {
			return 3;
		} else if (dis == Math.abs(cr1-cr2)) {	// dis == |cr1-cr2|
			return 1;
		} else if (dis < Math.abs(cr1-cr2)) {
			return 0;
		} else {
			return 2;
		}
	}
	
	
}