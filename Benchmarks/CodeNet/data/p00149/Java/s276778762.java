import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	static final int LEFT = 0;
	static final int RIGHT = 1;
	static final double[] eyeTable = { 1.1, 0.6, 0.2 };
	
	static int[][] numEye = new int[2][4];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		String buf = null;
		while((buf = br.readLine()) != null){
			String[] eye = buf.split(" ");
			String leftEyeClass = judgeEye(Double.parseDouble(eye[LEFT]));
			String rightEyeClass = judgeEye(Double.parseDouble(eye[RIGHT]));
			updateData(leftEyeClass, LEFT);
			updateData(rightEyeClass, RIGHT);
		}
		for(int i = 0; i < numEye[0].length; i++){
			System.out.println(numEye[LEFT][i] + " " + numEye[RIGHT][i]);
		}
	}
	
	private static void updateData(String eye, int side){
		switch(eye.charAt(0)){
		case 'A':
			numEye[side][0]++;
			break;
		case 'B':
			numEye[side][1]++;
			break;
		case 'C':
			numEye[side][2]++;
			break;
		case 'D':
			numEye[side][3]++;
			break;
		default:
			//DO NOTHING
		}
	}
	
	private static String judgeEye(double eye) {
		char eyeClass = 'D';
		for (int i = 0; i < eyeTable.length; i++) {
			if (eye >= eyeTable[i]) {
				eyeClass = (char) ((int) 'A' + i);
				break;
			}
		}
		return String.valueOf(eyeClass);
	}
}