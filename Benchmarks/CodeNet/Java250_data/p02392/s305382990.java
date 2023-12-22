import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {

		try {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String str;
			str = reader.readLine();
	        String[] arr = str.split(" ");
	        int a = Integer.parseInt(arr[0]);
	        int b = Integer.parseInt(arr[1]);
	        int c = Integer.parseInt(arr[2]);

			Main ao1_2 = new Main();

			boolean result = ao1_2.judgeThreeNumber(a,b,c);

			if(result){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}

	}

	/**
	 *
	 * @return
	 */
	private boolean judgeThreeNumber(int a, int b, int c){

		if(a < b && b < c){
			return true;

		}
		return false;
	}

}