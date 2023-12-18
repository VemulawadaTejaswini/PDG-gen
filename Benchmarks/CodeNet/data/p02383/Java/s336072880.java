import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			
			Dice dice = new Dice();
			dice.setLabel(str);
			String order = reader.readLine();
			dice.roll(order);
			System.out.println(dice.getTopLabel());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Dice {
	
	String[] label;
	String str;
	
	public void setLabel(String str) {
		this.str = str;
		
		for (int i = 0; i < 6; i++) {
			label = str.split(" ");
		}
	}
	
	public String getTopLabel() {
		return label[0];
	}
	
	public void roll(String order) {
		String[] arr = new String[4];
		for (int i = 0; i < order.length(); i++) {
			String dir = String.valueOf(order.charAt(i));
			
			if ("N".equals(dir)) {;
				arr[0] = label[1];
				arr[1] = label[5];
				arr[2] = label[4];
				arr[3] = label[0];
				
				label[0] = arr[0];
				label[1] = arr[1];
				label[5] = arr[2];
				label[4] = arr[3];
			} else if ("E".equals(dir)) {
				arr[0] = label[3];
				arr[1] = label[0];
				arr[2] = label[2];
				arr[3] = label[5];
				
				label[0] = arr[0];
				label[2] = arr[1];
				label[5] = arr[2];
				label[3] = arr[3];
			} else if ("W".equals(dir)) {
				arr[0] = label[2];
				arr[1] = label[5];
				arr[2] = label[3];
				arr[3] = label[0];
				
				label[0] = arr[0];
				label[2] = arr[1];
				label[5] = arr[2];
				label[3] = arr[3];
			} else if ("S".equals(dir)) {
				arr[0] = label[4];
				arr[1] = label[0];
				arr[2] = label[1];
				arr[3] = label[5];
				
				label[0] = arr[0];
				label[1] = arr[1];
				label[5] = arr[2];
				label[4] = arr[3];
			}

		}
	}
	
}