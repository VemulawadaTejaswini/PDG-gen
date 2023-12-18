import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		double[][] arr;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;
		int count = 0;

		try {
			if(null != (tmpString = bf.readLine())){
				count = Integer.parseInt(tmpString);
			}
			arr = new double[count][3];

			for(int i = 0; true; i++){
				tmpString = bf.readLine();
				if(tmpString.equals("0"))break;
				String[] tmp = tmpString.split(",");
				arr[i][1] = Double.parseDouble(tmp[0]);
				arr[i][2] = Double.parseDouble(tmp[1]);
				arr[i][0] = 0;
			}

			for(int i = 0; i < count - 1; i ++){
				for(int j = i + 1; j < count; j++){
					if(Math.pow(arr[i][1] - arr[j][1], 2) + Math.pow(arr[i][2] - arr[j][2], 2) < 4.0){
						arr[i][0] += 1;
						arr[j][0] += 1;
					}
				}
			}

			int max_number = 0;
			for(int i = 0; i < count; i ++){
				if(arr[i][0] > max_number)max_number = (int) arr[i][0];
			}
			System.out.println(max_number);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}

	}
}