import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int[] ans = new int[81];
		String tmpString = null;
		int dataSet_number = 0;
		boolean overFlg = false;

		try {
			if(null != (tmpString = bf.readLine())){
				dataSet_number = Integer.parseInt(tmpString);
				dataSet_number *= 2;
			}

			for(int i = 0; i < dataSet_number; i++){
				if(i % 2 == 0)ans = new int[81];
				if(null != (tmpString = bf.readLine())){
					if(!overFlg){
						int count = tmpString.length();
						if(count > 80){
							overFlg = true;
						} else {
							char[] arr = tmpString.toCharArray();
							for(int j = 0; j < 81; j++){
								if( i % 2 == 0 ){
									if(81 - j > count){
										ans[j] = 0;
									} else {
										ans[j] = Integer.parseInt(String.valueOf(arr[count - (81 - j)]));
									}
								} else {
									if(j < count){
										int tmp = Integer.parseInt(String.valueOf(arr[count - j - 1]));
										if(tmp != 0)ans[80 - j] += tmp;
									}
									if(j != 80 && ans[80 - j] > 9){
										ans[80 - j] -= 10;
										ans[79 - j] += 1;
									}
								}
							}
						}
					}
				}
				if(i % 2 == 1){
					if(ans[0] != 0 || overFlg){
						System.out.println("overflow");
					} else {
						boolean flg = false;
						for(int k = 1;k < 81; k++){
							if(ans[k] != 0)flg = true;
							if(flg)System.out.print(ans[k]);
						}
						System.out.println("");
					}
					overFlg = false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("error");
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}
}