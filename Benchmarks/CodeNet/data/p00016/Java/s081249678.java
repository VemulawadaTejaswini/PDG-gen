import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		Position currentPosition = new Position();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		//入力値をもとに移動する
		while((input = br.readLine()) != null){
			String[] i = input.split(",");
			int distance = Integer.parseInt(i[0]);
			int angle = Integer.parseInt(i[1]);
			if(distance == 0 && angle == 0)	break;
			currentPosition.move(distance, angle);
		}
		System.out.println(currentPosition);
		br.close();
	}
}

class Position{
	private double x;
	private double y;
	private int currentAngle;
	public Position() {
		x = 0.0;
		y = 0.0;
		currentAngle = 90;
	}
	public void move(int distance, int angle){
		x += distance * Math.cos(Math.toRadians(currentAngle));
		y += distance * Math.sin(Math.toRadians(currentAngle));
		currentAngle -= angle;
	}
	@Override
	public String toString(){
		return (int)x + "\n" + (int)y;
	}
}