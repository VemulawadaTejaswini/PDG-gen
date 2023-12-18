import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0016_TreasureHunt {
public class Main {
	private double x;
	private double y;
	private int angle;
	
	public static void main(String[] args) {
		try {
		//	Problem0016_TreasureHunt test = new Problem0016_TreasureHunt();
			Main test = new Main();
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while((line = reader.readLine()) != null) {
				String[] textArray = line.split(",");
				int[] numbers = new int[2];
				for(int i = 0; i < 2; i++) {
					numbers[i] = Integer.parseInt(textArray[i]);
				}
				if(numbers[0] == 0 && numbers[1] == 0) {
					System.out.println((int)test.getX());
					System.out.println((int)test.getY());
				} else {
					test.move(numbers[0]);
					test.turn(numbers[1]);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
/*	Problem0016_TreasureHunt() {
		x = 0.0;
		y = 0.0;
		angle = 90;
	}
*/
	Main() {
		x = 0.0;
		y = 0.0;
		angle = 90;
	}

	void move(int length) {
		x += length * Math.cos(Math.toRadians(angle));
		y += length * Math.sin(Math.toRadians(angle));
		
	//	System.out.println("x:" + x + "\ty:" + y + "\tangle:" + angle);
	}
	void turn(int angle) {
		this.angle = (this.angle - angle) % 360;
	}
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}

}