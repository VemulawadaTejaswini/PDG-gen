
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static ArrayList<Point> pointList = new ArrayList<Point>(4);
	private static ArrayList<String> resultList = new ArrayList<String>(1);
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numDataSet = sc.nextInt();
		for(int i = 0; i < numDataSet; i++){
				//4ÂÌÀWf[^ðüÍ©çæ¾·é
				setInputsToPointList();
				setResult(areParallel(pointList.get(0), pointList.get(1), pointList.get(2), pointList.get(3)));
				pointList.clear();
		}
		sc.close();
		printResultList();
	}
	
	private static void printResultList(){
		for(int i = 0; i < resultList.size(); i++){
			System.out.println(resultList.get(i));
		}
	}
	
	public static void setInputsToPointList(){
		Point point1 = new Point(sc.nextDouble(), sc.nextDouble());
		pointList.add(point1);
		Point point2 = new Point(sc.nextDouble(), sc.nextDouble());
		pointList.add(point2);
		Point point3 = new Point(sc.nextDouble(), sc.nextDouble());
		pointList.add(point3);
		Point point4 = new Point(sc.nextDouble(), sc.nextDouble());
		pointList.add(point4);
	}
	
	public static void setResult(boolean flag){
		if(flag){
			resultList.add("YES");
		}
		else{
			resultList.add("NO");
		}
	}
	
	private static boolean areParallel(Point a, Point b, Point c, Point d){
		if(getSlope(a, b) == getSlope(c, d)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static double getSlope(Point a, Point b){
		boolean aHasBiggerXThanB = aHasBiggerXThanB(a, b);
		
		double valiationX;
		if(aHasBiggerXThanB){
			valiationX = a.x - b.x;
		}
		else{
			valiationX = b.x - a.x;
		}
		
		double valiationY;
		if(aHasBiggerXThanB){
			valiationY = a.y - b.y;
		}
		else{
			valiationY = b.y - a.y;
		}
		
		double slope = valiationY / valiationX;
		if(slope == Double.NEGATIVE_INFINITY){
			slope = Double.POSITIVE_INFINITY;
		}
		
		return slope;
	}
	
	private static boolean aHasBiggerXThanB(Point a, Point b){
		boolean aHasBiggerX;
		if(a.x > b.x){
			aHasBiggerX = true;
		}
		else{
			aHasBiggerX = false;
		}
		return aHasBiggerX;
	}
}

class Point {
	double x;
	double y;
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
}