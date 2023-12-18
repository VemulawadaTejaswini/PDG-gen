
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static int X = 600;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> results = new ArrayList<Long>();
		
		try{
			while(true){
				int d = sc.nextInt();
				int  n = getNumRectangle(d);
				long area = 0;
				for(int i = 0; i < n; i++){
					area += getArea(d, i);
				}
				results.add(area);
			}
		}catch(NoSuchElementException e){
			//½àµÈ¢
		}
		
		//ÊXgÌoÍ
		for(int i = 0; i < results.size(); i++){
			System.out.println(results.get(i));
		}
	}
	private static long getArea(int d, int n){
		int tmp = n * d;
		int height = tmp * tmp;
		return height * d;
	}
	
	private static int getNumRectangle(int d){
		return X / d;
	}
}