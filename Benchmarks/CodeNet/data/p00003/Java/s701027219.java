import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0003_IsItaRightTriangle {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0003_IsItaRightTriangle test = new Problem0003_IsItaRightTriangle();
			Main test = new Main();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int number = Integer.parseInt(reader.readLine());
			int[] sides = new int[3];	//ÓÍ"side"çµ¢
			
			for(int i = 0; i < number; i++) {	//±±©ç{Ô
				String[] textArray = reader.readLine().split(" ");
				for(int j = 0; j < 3; j++) {
					sides[j] = Integer.parseInt(textArray[j]);
				}
				
				test.showAnswer(test.getMax(sides));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	int[] getMax(int[] array) {
		int[] targetArray = array;
		
		int max = targetArray[0];	//}CiXÌêÍ0ðãü³êéÆss
		int maxPosition = 0;		//0ªúlÈÌÍ¾ç©
		for(int i = 1; i < targetArray.length; i++) {
			if(max < targetArray[i]) {
				max = targetArray[i];
				maxPosition = i;
			}
		}
		
		int temporary = targetArray[0];
		targetArray[0] = max;
		targetArray[maxPosition] = temporary;
		
		return targetArray;
	}
	//ÅålªêÔOÉ ézñÉÎµÄA¼pOp`©Ç¤©¦ðo·B
	void showAnswer(int[] array) {
		if(array.length != 3) {
			throw new IllegalArgumentException();	//OÌ½ß
		}
		if(array[0] * array[0] == array[1] * array[1] + array[2] * array[2]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}