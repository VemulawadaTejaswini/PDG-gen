import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Position currentPosition = new Position();
		Scanner sc = new Scanner(System.in);
		String input;
		//入力値をもとに移動する
		while((input = sc.nextLine()) != null){
			String[] i = input.split(",");
			int distance = Integer.parseInt(i[0]);
			int angle = Integer.parseInt(i[1]);
			if(distance == 0 && angle == 0)	break;
			currentPosition.move(distance, angle);
		}
		//最終座標を表示
		System.out.println(currentPosition);
		sc.close();
	}
}

class Position{
	private int x;
	private int y;
	private int currentAngle;
	public Position() {
		x = 0;
		y = 0;
		currentAngle = 90;
	}
	public void move(int distance, int angle){
		currentAngle -= angle;
		x += distance * Math.cos(Math.toRadians(currentAngle));
		y += distance * Math.sin(Math.toRadians(currentAngle));
	}
	@Override
	public String toString(){
		return x + "\n" + y;
	}
}