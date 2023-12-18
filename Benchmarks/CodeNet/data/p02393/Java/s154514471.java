import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int len = 3;
		int[] num = new int[len];

		for(int i = 0; i < len; i++){
			num[i] = Integer.parseInt(line[i]);
		}

		for(int i = 0; i < len; i++){
			for(int j = len - 1; j > i; j--){
				if(num[j - 1] > num[j]){
					int temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;
				}
			}
		}

		for(int i = 0; i < len; i++){
			if(i == len - 1){
				System.out.println(num[i]);
			}else{
				System.out.print(num[i] + " ");
			}

		}

	}
}