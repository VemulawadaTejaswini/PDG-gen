import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String[] box = buff.readLine().split(" ");
		int[] num = new int[box.length];
		int count = -1;

		for(int i = 0; i < box.length; ++i){
			num[i] = Integer.parseInt(box[i]);
		}

		while(++count >= 0){
			for(int i = 0; i < box.length; ++i){
				for(int j = i + 1; j < box.length; ++j){
					// 整列
					if(num[i] > num[j]){
						int pre = num[i];
						num[i] = num[j];
						num[j] = pre;
					}
				}
			}

			if(num[0] == num[1] && num[1] == num[2]){
				break;
			}

			if(num[2] - num[0] >= 2){
				num[0] += 2;
			} else {
				++num[0];
				++num[1];
			}
		}

		System.out.println(count);
	}
}
