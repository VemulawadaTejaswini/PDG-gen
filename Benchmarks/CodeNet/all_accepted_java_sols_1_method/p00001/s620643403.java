import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data_num = 10;
		int top = 3;
		int[] data = new int[data_num];

		for(int i = 0; i < data_num; i++){
			data[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < data_num; i++){
			for(int j = data_num - 1; j > i; j--){
				if(data[j - 1] < data[j]){
					int temp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = temp;
				}
			}
		}

		for(int i = 0; i < top; i++){
			System.out.println(data[i]);
		}


	}
}