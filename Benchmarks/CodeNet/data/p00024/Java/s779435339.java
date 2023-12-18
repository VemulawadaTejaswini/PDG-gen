
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> input = new ArrayList<Double>();

		//üÍ³ê½lðXgÉÇÁ·é
		try{
			while(true){
				input.add(sc.nextDouble());
			}
		}catch(NoSuchElementException e){
			//½àµÈ¢ÅÌÉÚé
		}
		
		//Åá¬x©çKðßAoÍ·é
		for(int i = 0; i < input.size(); i++){
			System.out.println(getFloorNumber(getTime(input.get(i))));
		}
	}
	
	//ZÌ½ßÉêIÉdÍÁ¬xð98Æ·é
	private static final double GRAVITY = 98;
	public static double getTime(double velocity){
		//dÍÁ¬xð9.8Æ·é½ßAÅãÉ10ð©¯é
		return velocity / GRAVITY * 10;
	}

	public static int getFloorNumber(double time){
		//dÍÁ¬xð9.8Æ·é½ßAÅãÉPOÅé
		double y = time * time * GRAVITY / 2 / 10;
		int i;
		for( i = 1; (i * 5 - 5) < y; i++);
		return i;
	}
}