import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Hunter hunter = new Hunter();
		while(true){
			String[] tmpStr = br.readLine().split(",");
			int inputDir = Integer.parseInt(tmpStr[0]);
			int inputAngle = Integer.parseInt(tmpStr[1]);
			
			if(inputDir == 0&&inputAngle == 0){
				break;
			}
			
			hunter.move(inputDir, inputAngle);
		}
		
		System.out.println((int)hunter.x);
		System.out.println((int)hunter.y);
	}

}

class Hunter {
	double x = 0;
	double y = 0;
	int angle = 90;
	
	public void move(int distance, int angle){
		int newAngle = this.angle - angle;
		this.x += distance*Math.cos(Math.toRadians(this.angle));
		this.y += distance*Math.sin(Math.toRadians(this.angle));
		this.angle = newAngle;
		
		//System.out.println("(x,y) "+x+" "+y+"angle "+this.angle);
	}
}