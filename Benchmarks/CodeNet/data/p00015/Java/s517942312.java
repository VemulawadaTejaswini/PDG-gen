import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		int[] arr = new int[81];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;
		int count = 0;

		try {
			if(null != (tmpString = bf.readLine())){
				count = Integer.parseInt(tmpString);
			}

			for(int i = 0; i < count * 2; i++){
				tmpString = bf.readLine();
				char[] tmp = tmpString.toCharArray();
				int number = tmp.length;
				if(i % 2 == 0){
					arr = new int[81];
					for(int j = 0; j < number; j++){
						arr[number - j - 1] = Integer.parseInt(String.valueOf(tmp[j]));
					}
				} else {
					for(int j = 0; j < number; j++){
						arr[number - j - 1] += Integer.parseInt(String.valueOf(tmp[j]));
					}

					for(int j = 0; j < 81; j++){
						if(arr[j] > 9){
							arr[j] -= 10;
							arr[j + 1] += 1;
						}
					}

					boolean flg = false;
					for(int j = 80; j >= 0; j--){
						if(flg == false && arr[j] != 0){
							flg = true;
						}
						if(flg == true){
							System.out.print(arr[j]);
						}
					}
					System.out.println("");
				}
			}

		} catch (NumberFormatException e1) {
			System.out.println("error");
		} catch (IOException e1) {
			System.out.println("error");
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}

}