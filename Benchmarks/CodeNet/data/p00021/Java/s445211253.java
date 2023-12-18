
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Point> points = new ArrayList<Point>(4);
		ArrayList<String> results = new ArrayList<String>(1);
		
		try{
			while(true){
				//4ÂÌÀWf[^ðüÍ©çæ¾·é
				points.add(new Point(sc.nextDouble(), sc.nextDouble()));
				points.add(new Point(sc.nextDouble(), sc.nextDouble()));
				points.add(new Point(sc.nextDouble(), sc.nextDouble()));
				points.add(new Point(sc.nextDouble(), sc.nextDouble()));
				
				if(getSlope(points.get(0), points.get(1)) == getSlope(points.get(2), points.get(3))){
					results.add("YES");
				}
				else{
					results.add("NO");
				}
			}
		}catch(NoSuchElementException e){
			//hüÍÌIíèhªüÍ³ê½êA½à¹¸ÉÌsÌðs¤
		}
		
		for(int i = 0; i < results.size(); i++){
			System.out.println(results.get(i));
		}
	}
	
	public static double getSlope(Point a, Point b){
		boolean aHasBiggerX;
		if(a.x > b.x){
			aHasBiggerX = true;
		}
		else{
			aHasBiggerX = false;
		}
		
		double valiationX;
		if(aHasBiggerX){
			valiationX = a.x - b.x;
		}
		else{
			valiationX = b.x - a.x;
		}
		
		double valiationY;
		if(aHasBiggerX){
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
	
}